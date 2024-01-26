import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class FileChooserExample22 extends JFrame {
    public FileChooserExample22() {
        JButton selectButton = new JButton("Select File or Folder");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                int option = fileChooser.showOpenDialog(null);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFileOrFolder = fileChooser.getSelectedFile();
                    deleteDirectory(selectedFileOrFolder);
                }
            }
        });
        JPanel panel = new JPanel();
        panel.add(selectButton);
        add(panel);

        // set the frame properties
        setTitle("File Chooser Example");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooserExample22();
            }
        });
    }
}
