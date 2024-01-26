import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

class FolderZipperx2 {

    public static void main(String[] args) {
        // Create a file chooser to select the folder to zip
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select folder to zip");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File folderToZip = chooser.getSelectedFile();

            // Create a zip file with the same name as the selected folder
            File zipFile = new File(folderToZip.getParent(), folderToZip.getName() + ".zip");

            try (FileOutputStream fos = new FileOutputStream(zipFile);
                    ZipOutputStream zos = new ZipOutputStream(fos)) {
                // Add all files in the folder and its subfolders to the zip file
                addFolderToZip("", folderToZip, zos);

                // Show a message dialog to inform the user that the zip file was created
                JOptionPane.showMessageDialog(null,
                        "Zip file created successfully: " + zipFile.getAbsolutePath(), "Zip Success",
                        JOptionPane.INFORMATION_MESSAGE);

                folderToZip = zipFile; // change selected file to point to the newly created zip file
            } catch (IOException e) {
                e.printStackTrace();
            }
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
