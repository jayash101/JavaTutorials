package GUI_Controls.JDialogBox.OptionPane.ConfirmDialog;

import javax.swing.*;

public class Confirm_Dialog_Box extends JOptionPane {
    Confirm_Dialog_Box(){
        String message = "Are you sure you want to exit?";

        // JConfirmDialog
        JOptionPane.showConfirmDialog(this, message, "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
    }
}
