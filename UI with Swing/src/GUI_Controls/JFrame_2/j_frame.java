package GUI_Controls.JFrame_2;

import javax.swing.*;
import java.awt.*;

public class j_frame extends JFrame {
    // constructor
    j_frame(){
        this.setTitle("JFrame Example");

        // set image icon
        ImageIcon image = new ImageIcon("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\UI with Swing\\src\\GUI_Controls\\JFrame\\nepal.png");
            this.setIconImage(image.getImage());

        // set background color
            this.getContentPane().setBackground(new Color(0xFF23DD));

        // exit out of application
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // prevents application resizing
            this.setResizable(false);

        // set frame size in width(x-dimension) and height(y-dimension)
            this.setSize(400, 400);

        // make frame visible
            this.setVisible(true);
    }
}
