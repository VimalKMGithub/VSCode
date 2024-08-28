import javax.swing.*;
import java.awt.*;

class s0013_joptionpane_back_foreground {
    public static void main(String[] args) {
        UIManager.put("OptionPane.background", new Color(101, 67, 33));
        UIManager.put("Panel.background", new Color(101, 67, 33));
        JLabel label = new JLabel("Hello, world!");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.white);
        JOptionPane.showMessageDialog(null, label, "Custom JOptionPane", JOptionPane.INFORMATION_MESSAGE);
    }
}