package GUI_Controls.JColorChooser;

import javax.swing.*;
import java.awt.*;

public class JColorChooser_Example extends JFrame {
    JColorChooser_Example(){
        // JFrame
        this.setTitle("FileChooser Example");
        this.setSize(400, 400);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // JPanel
        JPanel panel = new JPanel();
        this.add(panel);

        // JColorChooser with showDialog without event listeners
        JColorChooser color_chooser = new JColorChooser();
        panel.add(color_chooser);
    }
}
