import javax.swing.JOptionPane;

public class EX61_ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change the first class ticket?", 
        "My Title", JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, "You've chosen: "
        + (option==JOptionPane.YES_OPTION?"Yes":"No"));

        System.exit(0);
    }
}
// Answer Question
// --------------------------------
//message : You've chosen: No
//Change it to: JOptionPane.showConfirmDialog(null,"Yes", "No", JOptionPane.YES_NO_OPTION);
