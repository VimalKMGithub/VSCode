import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class s0011_cancelButton extends JFrame implements ActionListener {
    private JButton cancelButton;

    s0011_cancelButton() {
        setTitle("Cancel");
        setSize(500, 75);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));

        JPanel cancelPanel = new JPanel(new FlowLayout());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        cancelPanel.add(cancelButton);
        add(cancelPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelButton) {
            dispose();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new s0011_cancelButton();
    }
}
