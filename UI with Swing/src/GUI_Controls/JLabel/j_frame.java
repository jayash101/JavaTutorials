package GUI_Controls.JLabel;

import javax.swing.*;
import java.awt.*;

public class j_frame extends JFrame{
    // JLabel: a GUI display area for a string of text, an image or both

    // constructor
    public j_frame(){
        this.setTitle("JLabel Example");

        this.getContentPane().setBackground(new Color(0xae3d2f));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);
        this.setVisible(true);

        this.add(new j_label());
    }
}
