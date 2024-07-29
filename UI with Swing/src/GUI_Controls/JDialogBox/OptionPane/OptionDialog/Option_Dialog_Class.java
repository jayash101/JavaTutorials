package GUI_Controls.JDialogBox.OptionPane.OptionDialog;

import javax.swing.*;

public class Option_Dialog_Class extends JOptionPane {
    Option_Dialog_Class(){
        // options
        String[] options = {"Naruto", "Bleach", "One Piece"};

        int selection = JOptionPane.showOptionDialog(this, "Select one: ", "Best arc in anime", 0, 3, null, options, options[0]);

        if(selection == 0){
            JOptionPane.showMessageDialog(this, "Pain Arc!");
        }
        else if(selection == 1){
            JOptionPane.showMessageDialog(this, "Soul Society Arc!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Marineford Arc!");
        }
    }
}
