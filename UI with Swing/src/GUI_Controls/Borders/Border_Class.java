package GUI_Controls.Borders;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Border_Class extends JFrame {
    Border_Class(){
        this.setTitle("Borders Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        // Borders
        JButton button = new JButton("Click Me");
        button.setBorder(BorderFactory.createLineBorder(new Color(0xcadfa1), 2));

        // Add button
        this.add(button);
    }
}
