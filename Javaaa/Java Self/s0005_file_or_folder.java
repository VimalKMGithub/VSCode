import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class s0005_file_or_folder extends JFrame {
    private JButton selectButton;

    public s0005_file_or_folder() {
        super("File Chooser Example");
        selectButton = new JButton("Select File or Folder");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                int result = fileChooser.showOpenDialog(s0005_file_or_folder.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file or folder: " + selectedFile.getAbsolutePath());
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(selectButton);
        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new s0005_file_or_folder();
    }
}