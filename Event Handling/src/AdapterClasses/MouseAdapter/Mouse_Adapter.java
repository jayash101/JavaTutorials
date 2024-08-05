package AdapterClasses.MouseAdapter;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Adapter extends JFrame {
    Mouse_Adapter(){
        this.setTitle("MouseAdapter Example");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // MouseAdapter
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // create the graphics object from frame
                Graphics g = getGraphics();

                // set the color of graphics object
                g.setColor(new Color(0x3a5bc3));

                // set the shape of graphics object anywhere you click
                g.fillOval(e.getX(), e.getY(), 20, 20);
            }
        });
    }
}
