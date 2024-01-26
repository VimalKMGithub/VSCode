import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class FileChooserExample2 extends JFrame {

    private JTextField filePathTextField;

    public FileChooserExample2() {
        // create a text field to display the selected file or folder path
        filePathTextField = new JTextField();
        filePathTextField.setEditable(false);

        // create a button to launch the file chooser dialog box
        JButton selectButton = new JButton("Select File or Folder");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                int option = fileChooser.showOpenDialog(null);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFileOrFolder = fileChooser.getSelectedFile();
                    filePathTextField.setText(selectedFileOrFolder.getAbsolutePath());
                }
            }
        });

        // add the components to the frame
        JPanel panel = new JPanel();
        panel.add(filePathTextField);
        panel.add(selectButton);
        add(panel);

        // set the frame properties
        setTitle("File Chooser Example");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooserExample2();
            }
        });
    }
}
