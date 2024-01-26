import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

class FolderZipperUnzipper {
    public static void main(String[] args) {
        // Create a file chooser to select the folder to zip or unzip
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select folder to zip or unzip");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".zip");
            }

            public String getDescription() {
                return "Directories and zip files";
            }
        });

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = chooser.getSelectedFile();
            int choice = JOptionPane.showOptionDialog(null,
                    "Would you like to zip or unzip the selected folder?", "Zip or Unzip", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, new String[] { "Zip", "Unzip" }, "Zip");

            if (choice == 0) {
                // Zip the selected folder
                File zipFile = new File(selectedFolder.getAbsolutePath() + ".zip");
                try (FileOutputStream fos = new FileOutputStream(zipFile);
                        ZipOutputStream zos = new ZipOutputStream(fos)) {
                    addFolderToZip("", selectedFolder, zos);
                    JOptionPane.showMessageDialog(null,
                            "Zip file created successfully: " + zipFile.getAbsolutePath(), "Zip Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                // Unzip the selected folder
                try (ZipInputStream zis = new ZipInputStream(new FileInputStream(selectedFolder))) {
                    ZipEntry entry;
                    while ((entry = zis.getNextEntry()) != null) {
                        File file = new File(selectedFolder.getParent(), entry.getName());
                        if (entry.isDirectory()) {
                            file.mkdirs();
                        } else {
                            File parent = file.getParentFile();
                            if (!parent.exists()) {
                                parent.mkdirs();
                            }
                            try (FileOutputStream fos = new FileOutputStream(file)) {
                                byte[] buffer = new byte[1024];
                                int length;
                                while ((length = zis.read(buffer)) > 0) {
                                    fos.write(buffer, 0, length);
                                }
                            }
                        }
                        zis.closeEntry();
                    }
                    JOptionPane.showMessageDialog(null,
                            "Folder unzipped successfully: " + selectedFolder.getAbsolutePath(), "Unzip Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void addFolderToZip(String parentFolder, File folder, ZipOutputStream zos) throws IOException {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                addFolderToZip(parentFolder + folder.getName() + "/", file, zos);
            } else {
                zos.putNextEntry(new ZipEntry(parentFolder + folder.getName() + "/" + file.getName()));
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
