import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

class ZipperUnzipperGUI extends JFrame {

    private JFileChooser fileChooser;
    private JButton selectFileButton;
    private JButton zipButton;
    private JButton unzipButton;
    private File selectedFile;

    public ZipperUnzipperGUI() {
        super("Zipper/Unzipper");

        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Zip files", "zip"));

        selectFileButton = new JButton("Select File/Folder");
        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = fileChooser.showOpenDialog(ZipperUnzipperGUI.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                }
            }
        });

        zipButton = new JButton("Zip");
        zipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedFile == null) {
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this, "Please select a file/folder to zip.",
                            "No File Selected", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (selectedFile.getName().endsWith(".zip")) {
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this, "The selected file is already a zip file.",
                            "Invalid File", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try {
                    String zipFileName = selectedFile.getAbsolutePath() + ".zip";
                    zip(selectedFile, new File(zipFileName));
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this, "File/Folder zipped successfully.",
                            "Zip Success", JOptionPane.INFORMATION_MESSAGE);
                    delete(selectedFile);
                    selectedFile = new File(zipFileName);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this,
                            "An error occurred while zipping the file/folder.",
                            "Zip Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        unzipButton = new JButton("Unzip");
        unzipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedFile == null) {
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this, "Please select a zip file to unzip.",
                            "No File Selected", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!selectedFile.getName().endsWith(".zip")) {
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this, "The selected file is not a zip file.",
                            "Invalid File", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try {
                    unzip(selectedFile);
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this, "File/Folder unzipped successfully.",
                            "Unzip Success", JOptionPane.INFORMATION_MESSAGE);
                    delete(selectedFile);
                    selectedFile = null;
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(ZipperUnzipperGUI.this,
                            "An error occurred while unzipping the file/folder.",
                            "Unzip Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel panel = new JPanel();
        // Adding components to the panel and setting the layout
        panel.setLayout(new BorderLayout());
        panel.add(selectFileButton, BorderLayout.WEST);
        panel.add(zipButton, BorderLayout.CENTER);
        panel.add(unzipButton, BorderLayout.EAST);
        // Adding the panel to the JFrame
        add(panel);

        // Setting JFrame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Method to zip a file or directory
    private void zip(File source, File destination) throws IOException {
        FileOutputStream fos = new FileOutputStream(destination);
        ZipOutputStream zos = new ZipOutputStream(fos);
        zipFile(source, source.getName(), zos);
        zos.close();
        fos.close();
    }

    // Method to recursively zip a file or directory
    private void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
            }
            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        fis.close();
    }

    // Method to unzip a file
    private void unzip(File zipFile) throws IOException {
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry zipEntry = zis.getNextEntry();
        while (zipEntry != null) {
            File newFile = newFile(new File(zipFile.getParent()), zipEntry);
            if (zipEntry.isDirectory()) {
                newFile.mkdirs();
            } else {
                newFile.getParentFile().mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
            }
            zipEntry = zis.getNextEntry();
        }
        zis.closeEntry();
        zis.close();
    }

    // Method to delete a file or directory
    private void delete(File file) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (File child : children) {
                delete(child);
            }
        }
        file.delete();
    }

    // Method to create a new file
    private File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());
        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();
        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Zip entry traversal attack prevented");
        }
        return destFile;
    }

    public static void main(String[] args) {
        new ZipperUnzipperGUI();
    }
}