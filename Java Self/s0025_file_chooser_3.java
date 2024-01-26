import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.swing.*;
import java.awt.event.*;

class FileChooserExample33 extends JFrame {
    public FileChooserExample33() {
        JButton selectButton = new JButton("Select File or Folder");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                int option = fileChooser.showOpenDialog(null);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFileOrFolder = fileChooser.getSelectedFile();
                    unzDel(selectedFileOrFolder);
                }
            }
        });
        JPanel panel = new JPanel();
        panel.add(selectButton);
        add(panel);
        setTitle("File Chooser Example");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    static void zipDel(File selFil) {
        File zipFil = new File(selFil.getAbsolutePath() + ".zip");
        try (FileOutputStream fos = new FileOutputStream(zipFil); ZipOutputStream zos = new ZipOutputStream(fos)) {
            zipAdd("", selFil, zos);
            del(selFil);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void zipAdd(String parentFolder, File folder, ZipOutputStream zos) throws IOException {
        for (File fil : folder.listFiles()) {
            if (fil.isDirectory()) {
                zipAdd(parentFolder + fil.getName() + "/", fil, zos);
            } else {
                zos.putNextEntry(new ZipEntry(parentFolder + fil.getName()));
                try (FileInputStream fis = new FileInputStream(fil)) {
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = fis.read(buf)) > 0) {
                        zos.write(buf, 0, len);
                    }
                }
            }
        }
    }

    static void unzDel(File selFil) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(selFil))) {
            File unzFil = new File(selFil.getParentFile(), selFil.getName().replace(".zip", ""));
            unzFil.mkdir();

            ZipEntry ent = zis.getNextEntry();
            while (ent != null) {
                File fil = new File(unzFil, ent.getName());
                if (ent.isDirectory()) {
                    fil.mkdirs();
                } else {
                    fil.getParentFile().mkdirs();
                    try (FileOutputStream fos = new FileOutputStream(fil)) {
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = zis.read(buf)) > 0) {
                            fos.write(buf, 0, len);
                        }
                    }
                }
                ent = zis.getNextEntry();
            }
            selFil.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void del(File selFil) {
        File[] fil = selFil.listFiles();
        if (fil != null) {
            for (File file : fil) {
                if (file.isDirectory()) {
                    del(file);
                } else {
                    file.delete();
                }
            }
        }
        selFil.delete();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooserExample33();
            }
        });
    }
}