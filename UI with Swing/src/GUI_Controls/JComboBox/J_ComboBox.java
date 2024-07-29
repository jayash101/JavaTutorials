package GUI_Controls.JComboBox;

import javax.swing.*;
import java.awt.*;

public class J_ComboBox extends JFrame {
    J_ComboBox(){

        // JFrame
        this.setTitle("JComboBox Example");
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // JComboBox
        String[] name = {"Select a language", "Java", "C++", "Python", "JavaScript"};
        JComboBox<String> combo_box = new JComboBox<String>(name);

        // Add JComboBox
        this.add(combo_box);

    }
}
