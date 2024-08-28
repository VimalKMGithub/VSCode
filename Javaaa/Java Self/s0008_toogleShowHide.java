import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class s0008_toogleShowHide extends JFrame implements ActionListener {
    private JRadioButton encryptOption, decryptOption;
    private JPasswordField passwordField;
    private JTextField selectFileField;
    private JButton fileButton, submitButton;
    private File selectedFile;

    public s0008_toogleShowHide() {
        setTitle("Encryption/Decryption");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JPanel optionPanel = new JPanel(new FlowLayout());
        encryptOption = new JRadioButton("Encrypt");
        encryptOption.setEnabled(false);
        decryptOption = new JRadioButton("Decrypt");
        decryptOption.setEnabled(false);
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
        JToggleButton showPasswordToggle = new JToggleButton("Show/Hide");
        showPasswordToggle.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    passwordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('●');
                }
            }
        });
        passwordPanel.add(showPasswordToggle);
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
        submitButton.setEnabled(false);
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
        }
    }

    public static void main(String[] args) {
        s0008_toogleShowHide gui = new s0008_toogleShowHide();
        gui.setVisible(true);
    }
}