import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class s0006_guiDifferent extends JFrame implements ActionListener {
    private final JLabel filePathLabel;
    private final JTextField filePathField;
    private final JButton filePathButton;
    private final JLabel keyLabel;
    private final JTextField keyField;
    private final JLabel operationLabel;
    private final JButton encryptButton;
    private final JButton decryptButton;
    private final JFileChooser fileChooser;

    public s0006_guiDifferent() {
        filePathLabel = new JLabel("File path:");
        filePathField = new JTextField();
        filePathButton = new JButton("Select");
        keyLabel = new JLabel("Key:");
        keyField = new JTextField();
        operationLabel = new JLabel("Operation:");
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        fileChooser = new JFileChooser();
        filePathButton.addActionListener(this);
        encryptButton.addActionListener(this);
        decryptButton.addActionListener(this);

        JPanel filePathPanel = new JPanel(new BorderLayout());
        filePathPanel.add(filePathLabel, BorderLayout.WEST);
        filePathPanel.add(filePathField, BorderLayout.CENTER);
        filePathPanel.add(filePathButton, BorderLayout.EAST);

        JPanel keyPanel = new JPanel(new GridLayout(1, 2));
        keyPanel.add(keyLabel);
        keyPanel.add(keyField);

        JPanel operationPanel = new JPanel(new GridLayout(1, 3));
        operationPanel.add(operationLabel);
        operationPanel.add(encryptButton);
        operationPanel.add(decryptButton);

        setLayout(new GridLayout(3, 1));
        add(filePathPanel);
        add(keyPanel);
        add(operationPanel);

        setTitle("File Encryptor / Decryptor");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == filePathButton) {
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                filePathField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        } else if (e.getSource() == encryptButton) {
        } else if (e.getSource() == decryptButton) {
        }
    }

    public static void main(String[] args) {
        new s0006_guiDifferent();
    }
}