package GUI_Controls.JLabel;

import javax.swing.*;
import java.awt.*;

public class j_label extends JLabel {
    j_label(){

        // set text of label
        this.setText("Hello there");

//        // set Image in label
//        ImageIcon image = new ImageIcon("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\UI with Swing\\src\\GUI_Controls\\JLabel\\cyber-kitty.jpg");
//        this.setIcon(image);

//        // set text position (LEFT, CENTER or RIGHT) with respect to the image
//        this.setHorizontalTextPosition(JLabel.CENTER);
//
//        // set text position (TOP, CENTER or BOTTOM) with respect to the image
//        this.setVerticalTextPosition(JLabel.CENTER);

        // set font color of label
        this.setForeground(new Color(0xc2dff3));

        // set font styles of label
        this.setFont(new Font("Calibri", Font.PLAIN, 20));

//        // set gap of text to image
//        this.setIconTextGap(10);

//        this.setBackground(new Color(0xddffd2));
//        this.setOpaque(true);

        this.setVisible(true);

    }
}