package GUI_Controls.JDialogBox.OptionPane.MessageDialog;

import javax.swing.*;

public class Message_Dialog_Box extends JOptionPane {
    Message_Dialog_Box(){
        // Input Section
        String ask_age = JOptionPane.showInputDialog("Enter your age");

        // Calculation
        int age = Integer.parseInt(ask_age);

        if(age < 18){
            JOptionPane.showMessageDialog(this, "You cannot vote", "Error", ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "You can vote", "Success", PLAIN_MESSAGE);
        }
    }

}
