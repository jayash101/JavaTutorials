package GUI_Controls.JCheckBox;

import javax.swing.*;
import java.awt.*;

public class J_CheckBox extends JFrame {
    J_CheckBox(){
        this.setTitle("JCheckBox Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        // Check Box 1
        JCheckBox check_box = new JCheckBox("Agree");
        this.add(check_box);

        // Check Box 2
        check_box = new JCheckBox("Neutral");
        this.add(check_box);

        // Check Box 3
        check_box = new JCheckBox("Disagree");
        this.add(check_box);
    }
}
