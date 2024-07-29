package GridBagLayout;

import javax.swing.*;
import java.awt.*;

public class GridBag_layout extends JFrame {
    GridBag_layout(){
        this.setTitle("JCheckBox Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);

        // Creating and adding panel to JFrame
        JPanel panel = new JPanel(new GridBagLayout());
        this.getContentPane().add(panel);

        // Creating constraints for grid
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Creating buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Adding button1 to the panel
        constraints.gridx = 0;  // Display Order for x-axis
        constraints.gridy = 0;  // Display Order for y-axis
        panel.add(button1, constraints);

        // Adding button2 to the panel
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(button2, constraints);

        // Adding button3 to the panel
        constraints.gridx = 2;
        constraints.gridy = 0;
        panel.add(button3, constraints);

        // Adding button4 to the panel
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;  // display amount of space taken by n elements
        panel.add(button4, constraints);

        // Adding button5 to the panel
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        panel.add(button5, constraints);
    }
}
