package GridLayout;

import javax.swing.*;
import java.awt.*;

public class Grid_layout extends JFrame {
    Grid_layout(){
        this.setTitle("JCheckBox Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);

        // Setting GridLayout; params(rows, columns)
        this.setLayout(new GridLayout(2, 3));

        // Creating buttons
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
