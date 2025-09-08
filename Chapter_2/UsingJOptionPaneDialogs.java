import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name;
        int choice;

        do {
            do {
                name = JOptionPane.showInputDialog("Please Enter Your Name: ");
            } while (name == null);
            choice = JOptionPane.showConfirmDialog(null,"Do you want to display your name?","Confirmation", JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello " + name + "!");
            }
        } while (choice == JOptionPane.NO_OPTION);
    }
}
