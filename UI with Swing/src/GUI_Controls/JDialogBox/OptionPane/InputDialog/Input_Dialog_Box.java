package GUI_Controls.JDialogBox.OptionPane.InputDialog;

import javax.swing.*;

public class Input_Dialog_Box extends JOptionPane {
    Input_Dialog_Box(){
        // Input section
        String first_number = JOptionPane.showInputDialog("Enter first number");
        String second_number = JOptionPane.showInputDialog("Enter second number");

        // Calculation
        int number_1 = Integer.parseInt(first_number);
        int number_2 = Integer.parseInt(second_number);
        int sum = number_1 + number_2;

        // JInputDialog
        JOptionPane.showMessageDialog(this, "Your sum: " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
        // params(parent_frame, message, title, message_type)

    }
}
