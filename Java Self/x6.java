import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.*;

class Zipperx {
    public static void main(String[] args) {
        // Create a file chooser to select the file to zip
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select file to zip");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fileToZip = chooser.getSelectedFile();

            // Create a zip file with the same name as the selected file
            File zipFile = new File(fileToZip.getAbsolutePath() + ".zip");

            try (FileOutputStream fos = new FileOutputStream(zipFile);
                    ZipOutputStream zos = new ZipOutputStream(fos)) {
                // Add the selected file to the zip file
                addFileToZip(fileToZip.getName(), fileToZip, zos);

                // Show a message dialog to inform the user that the zip file was created
                JOptionPane.showMessageDialog(null, "Zip file created successfully: " + zipFile.getAbsolutePath(),
                        "Zip Success", JOptionPane.INFORMATION_MESSAGE);

                // Replace the original file with the newly created zip file
                if (fileToZip.delete()) {
                    if (zipFile.renameTo(fileToZip)) {
                        // Show a message dialog to inform the user that the file was replaced with the
                        // zip file
                        JOptionPane.showMessageDialog(null,
                                "File replaced with zip file: " + fileToZip.getAbsolutePath(),
                                "Zip Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to replace file with zip file",
                                "Zip Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete original file",
                            "Zip Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addFileToZip(String fileName, File file, ZipOutputStream zos) throws IOException {
        zos.putNextEntry(new ZipEntry(fileName));
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, length);
            }
        }
    }
}
