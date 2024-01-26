import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

class FolderZipperx3 {

    public static void main(String[] args) {
        // Create a file chooser to select a folder or zip file
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select a folder or zip file");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            if (selectedFile.isDirectory()) {
                // Create a zip file with the same name as the selected folder
                File zipFile = new File(selectedFile.getAbsolutePath() + ".zip");

                try (FileOutputStream fos = new FileOutputStream(zipFile);
                        ZipOutputStream zos = new ZipOutputStream(fos)) {
                    // Add all files in the folder and its subfolders to the zip file
                    addFolderToZip("", selectedFile, zos);

                    // Show a message dialog to inform the user that the zip file was created
                    JOptionPane.showMessageDialog(null, "Zip file created successfully: " + zipFile.getAbsolutePath(),
                            "Zip Success", JOptionPane.INFORMATION_MESSAGE);
                    selectedFile = zipFile;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (selectedFile.isFile() && selectedFile.getName().endsWith(".zip")) {
                // Unzip the selected zip file
                try (ZipInputStream zis = new ZipInputStream(new FileInputStream(selectedFile))) {
                    File unzipFolder = new File(selectedFile.getParentFile(),
                            selectedFile.getName().replace(".zip", ""));
                    unzipFolder.mkdir();

                    ZipEntry entry = zis.getNextEntry();
                    while (entry != null) {
                        File file = new File(unzipFolder, entry.getName());
                        if (entry.isDirectory()) {
                            file.mkdirs();
                        } else {
                            file.getParentFile().mkdirs();
                            try (FileOutputStream fos = new FileOutputStream(file)) {
                                byte[] buffer = new byte[1024];
                                int length;
                                while ((length = zis.read(buffer)) > 0) {
                                    fos.write(buffer, 0, length);
                                }
                            }
                        }
                        entry = zis.getNextEntry();
                    }

                    // Show a message dialog to inform the user that the zip file was unzipped
                    JOptionPane.showMessageDialog(null,
                            "Zip file unzipped successfully to: " + unzipFolder.getAbsolutePath(),
                            "Unzip Success", JOptionPane.INFORMATION_MESSAGE);
                    selectedFile = unzipFolder;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Do whatever you want with the selected file
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }

    private static void addFolderToZip(String parentFolder, File folder, ZipOutputStream zos) throws IOException {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                addFolderToZip(parentFolder + file.getName() + "/", file, zos);
            } else {
                zos.putNextEntry(new ZipEntry(parentFolder + file.getName()));
                try (FileInputStream fis = new FileInputStream(file)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, length);
                    }
                }
            }
        }
    }
}