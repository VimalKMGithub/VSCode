import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class s0004_folderChooser extends JFrame {
    private JButton selectButton;

    public s0004_folderChooser() {
        super("Folder Chooser Example");
        selectButton = new JButton("Select Folder");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int result = fileChooser.showOpenDialog(s0004_folderChooser.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected folder: " + selectedFile.getAbsolutePath());
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
        new s0004_folderChooser();
    }
}