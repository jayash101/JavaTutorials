package GUI_Controls.JFrame_1;
import javax.swing.*;
import java.awt.*;

public class j_frame {
    public static void main(String[] args) {

        // JFrame: a GUI window to add components to

        // creates a frame with title
        JFrame frame = new JFrame("Label Example");

        // set image icon
        ImageIcon image = new ImageIcon("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\UI with Swing\\src\\GUI_Controls\\JFrame\\nepal.png");
        frame.setIconImage(image.getImage());

        // set background color
        frame.getContentPane().setBackground(new Color(0xFF23DD));

        // exit out of application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // prevents application resizing
        frame.setResizable(false);

        // set frame size in width(x-dimension) and height(y-dimension)
        frame.setSize(400, 400);

        // make frame visible
        frame.setVisible(true);
    }
}
