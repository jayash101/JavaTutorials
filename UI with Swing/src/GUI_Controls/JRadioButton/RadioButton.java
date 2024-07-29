package GUI_Controls.JRadioButton;

import javax.swing.*;
import java.awt.*;

public class RadioButton extends JFrame {
    RadioButton(){
        this.setTitle("JRadioButton Example");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        //JRadioButton
        JRadioButton button1 = new JRadioButton("Male");
        JRadioButton button2 = new JRadioButton("Female");

        button1.setBounds(75, 50, 100, 30);
        button2.setBounds(75, 50, 100, 30);

        // this is used for selecting only one option
        ButtonGroup button_group = new ButtonGroup();
        button_group.add(button1);
        button_group.add(button2);

        // Add radio buttons in the JFrame
        this.add(button1);
        this.add(button2);
    }
}
