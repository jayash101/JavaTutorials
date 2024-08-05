package GUI_Controls.JDialogBox.CustomDialogBox;

import javax.swing.*;
import java.awt.*;

public class Custom_Dialog extends JFrame {
    Custom_Dialog(){
        // JFrame
        this.setTitle("Custom Dialog Box");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);

        // JLabel
        JLabel label = new JLabel("Name:");

        // JTextField
        JTextField text_field = new JTextField(10);

        // JDialog
        JDialog dialog = new JDialog(this, "Dialog Box", true);
        dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        dialog.setSize(400, 300);
        dialog.setLocation(100, 100);
        dialog.add(label);
        dialog.add(text_field);
        dialog.setVisible(true);
    }
}
