import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class s0007_gui2 extends JFrame implements ActionListener {
    private JRadioButton encryptOption, decryptOption;
    private JPasswordField passwordField;
    private JTextField selectFileField;
    private JButton fileButton, submitButton;
    private File selectedFile;
    private JCheckBox showPassword;

    public s0007_gui2() {
        setTitle("Encryption/Decryption");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JPanel optionPanel = new JPanel(new FlowLayout());
        encryptOption = new JRadioButton("Encrypt");
        decryptOption = new JRadioButton("Decrypt");
        ButtonGroup optionGroup = new ButtonGroup();
        optionGroup.add(encryptOption);
        optionGroup.add(decryptOption);
        optionPanel.add(encryptOption);
        optionPanel.add(decryptOption);
        add(optionPanel);

        JPanel passwordPanel = new JPanel(new FlowLayout());
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        showPassword = new JCheckBox("Show Password");
        showPassword.addActionListener(this);
        passwordPanel.add(showPassword);
        add(passwordPanel);

        JPanel selectFilePanel = new JPanel(new FlowLayout());
        JLabel selectFileLabel = new JLabel("Filename: ");
        selectFileField = new JTextField(20);
        selectFileField.setEditable(false);
        selectFilePanel.add(selectFileLabel);
        selectFilePanel.add(selectFileField);
        add(selectFilePanel);

        JPanel filePanel = new JPanel(new FlowLayout());
        JLabel fileLabel = new JLabel("Select a file: ");
        fileButton = new JButton("Browse");
        fileButton.addActionListener(this);
        filePanel.add(fileLabel);
        filePanel.add(fileButton);
        add(filePanel);

        JPanel submitPanel = new JPanel(new FlowLayout());
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitPanel.add(submitButton);
        add(submitPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fileButton) {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                selectFileField.setText(selectedFile.getAbsolutePath());
                encryptOption.setEnabled(true);
                decryptOption.setEnabled(true);
                submitButton.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "File Not Selected", "Message",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == submitButton) {
            if (encryptOption.isSelected()) {
            } else if (decryptOption.isSelected()) {
            }
        } else if (e.getSource() == showPassword) {
            passwordField.setEchoChar(showPassword.isSelected() ? '\u0000' : '●');
        }
    }

    public static void main(String[] args) {
        s0007_gui2 gui = new s0007_gui2();
        gui.setVisible(true);
    }
}