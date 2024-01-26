import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

class PasswordDialogExample {

    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = { "Please enter password:\n\n", passwordField };
        int result = JOptionPane.showConfirmDialog(null, obj, "Password Dialog", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            char[] password = passwordField.getPassword();
            System.out.println("Password entered: " + new String(password));
        } else {
            System.out.println("User cancelled the dialog");
        }
    }

}
