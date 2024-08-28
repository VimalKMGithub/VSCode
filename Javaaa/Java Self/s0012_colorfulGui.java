import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

class s0012_colorfulGui extends JFrame implements ActionListener {
    private JRadioButton encryptOption, decryptOption;
    private JPasswordField passwordField;
    private JTextField selectedFileName;
    private JButton fileButton, submitButton, cancelButton;
    private File selectedFile;
    private JCheckBox showPassword;
    private String passwordpattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[`~!@#$%^&*()\\-_=+\\[{\\]}\\\\|;:'\",<.>/?]).{8,}$";

    s0012_colorfulGui() {
        setTitle("Encryption / Decryption");
        setSize(500, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        getContentPane().setBackground(new Color(28, 37, 46));

        JPanel optionPanel = new JPanel(new FlowLayout());
        encryptOption = new JRadioButton("Encrypt");
        encryptOption.setFont(new Font("Arial", Font.PLAIN, 18));
        encryptOption.setForeground(Color.WHITE);
        encryptOption.setBackground(new Color(28, 37, 46));
        encryptOption.setEnabled(false);
        decryptOption = new JRadioButton("Decrypt");
        decryptOption.setFont(new Font("Arial", Font.PLAIN, 18));
        decryptOption.setForeground(Color.WHITE);
        decryptOption.setBackground(new Color(28, 37, 46));
        decryptOption.setEnabled(false);
        ButtonGroup optionGroup = new ButtonGroup();
        optionGroup.add(encryptOption);
        optionGroup.add(decryptOption);
        optionPanel.add(encryptOption);
        optionPanel.add(decryptOption);
        optionPanel.setBackground(new Color(28, 37, 46));
        add(optionPanel);

        JPanel passwordPanel = new JPanel(new FlowLayout());
        JLabel passwordLabel = new JLabel("Password : ");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordLabel.setForeground(Color.WHITE);
        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('●');
        passwordField.setBackground(new Color(199, 236, 238));
        passwordField.setEditable(false);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        showPassword = new JCheckBox("Show Password");
        showPassword.setFont(new Font("Arial", Font.PLAIN, 18));
        showPassword.setForeground(Color.WHITE);
        showPassword.setBackground(new Color(28, 37, 46));
        showPassword.setEnabled(false);
        showPassword.addActionListener(this);
        passwordPanel.add(showPassword);
        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                enableOptions();
            }

            public void removeUpdate(DocumentEvent e) {
                enableOptions();
            }

            public void changedUpdate(DocumentEvent e) {
                enableOptions();
            }

            private void enableOptions() {
                if (passwordField.getPassword().length > 0) {
                    encryptOption.setEnabled(true);
                    decryptOption.setEnabled(true);
                    encryptOption.addItemListener(new ItemListener() {
                        public void itemStateChanged(ItemEvent e) {
                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                submitButton.setEnabled(true);
                            }
                        }
                    });
                    decryptOption.addItemListener(new ItemListener() {
                        public void itemStateChanged(ItemEvent e) {
                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                submitButton.setEnabled(true);
                            }
                        }
                    });
                } else {
                    encryptOption.setSelected(false);
                    encryptOption.setEnabled(false);
                    decryptOption.setSelected(false);
                    decryptOption.setEnabled(false);
                    submitButton.setEnabled(false);
                }
            }
        });
        passwordPanel.setBackground(new Color(28, 37, 46));
        add(passwordPanel);

        JPanel filePanel = new JPanel(new FlowLayout());
        JLabel fileLabel = new JLabel("Select a File : ");
        fileLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        fileLabel.setForeground(Color.WHITE);
        selectedFileName = new JTextField(20);
        selectedFileName.setEditable(false);
        selectedFileName.setBackground(new Color(199, 236, 238));
        fileButton = new JButton("Browse");
        fileButton.setFont(new Font("Arial", Font.PLAIN, 18));
        fileButton.addActionListener(this);
        filePanel.add(fileLabel);
        filePanel.add(selectedFileName);
        filePanel.add(fileButton);
        filePanel.setBackground(new Color(28, 37, 46));
        add(filePanel);

        JPanel submitCancelPanel = new JPanel(new FlowLayout());
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 18));
        submitButton.setEnabled(false);
        submitButton.addActionListener(this);
        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Arial", Font.PLAIN, 18));
        cancelButton.addActionListener(this);
        submitCancelPanel.add(submitButton);
        submitCancelPanel.add(cancelButton);
        submitCancelPanel.setBackground(new Color(28, 37, 46));
        add(submitCancelPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fileButton) {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                selectedFileName.setText(selectedFile.getAbsolutePath());
                passwordField.setEditable(true);
                showPassword.setEnabled(true);
            } else if (returnVal != JFileChooser.APPROVE_OPTION && selectedFile == null) {
                JOptionPane.showMessageDialog(null, "File Not Selected", "Message",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == submitButton) {
            if ((new String(passwordField.getPassword())).matches(passwordpattern)) {
                if (encryptOption.isSelected()) {
                } else if (decryptOption.isSelected()) {
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Password Must meet following requirements\n1. At least one capital letter\n2. At least one small letter\n3. At least one number\n4. At least one special character\n5. At least 8 characters long",
                        "Password Requirements",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == showPassword) {
            passwordField.setEchoChar(showPassword.isSelected() ? '\u0000' : '●');
        } else if (e.getSource() == cancelButton) {
            dispose();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new s0012_colorfulGui();
    }
}