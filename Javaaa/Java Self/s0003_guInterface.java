import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

class s0003_guInterface extends JFrame {
    private JPasswordField passwordField;
    private JTextField filenameField;

    s0003_guInterface() {
        super("Password and Filename");
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel filenameLabel = new JLabel("Filename:");
        filenameField = new JTextField();
        JButton selectFileButton = new JButton("Select File");
        selectFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(s0003_guInterface.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    filenameField.setText(file.getAbsolutePath());
                }
            }
        });

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                String filename = filenameField.getText();
                System.out.println("Password: " + password);
                System.out.println("Filename: " + filename);
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(filenameLabel);
        panel.add(filenameField);
        panel.add(selectFileButton);
        panel.add(submitButton);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new s0003_guInterface();
            }
        });
    }
}