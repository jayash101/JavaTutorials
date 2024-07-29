package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Flow_layout extends JFrame {

    // constructor
    Flow_layout(){
        this.setTitle("FlowLayout Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);

        // Set FlowLayout to leading orientation
        this.setLayout(new FlowLayout(FlowLayout.LEADING));

        // Creating Buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Adding buttons to JFrame
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
    }
}
