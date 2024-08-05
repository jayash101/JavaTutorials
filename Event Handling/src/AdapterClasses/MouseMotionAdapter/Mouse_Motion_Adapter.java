package AdapterClasses.MouseMotionAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Motion_Adapter extends JFrame {
    Mouse_Motion_Adapter(){
        // JFrame
        this.setTitle("Mouse Motion Adapter Example");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);

        // MouseMotionAdapter
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Create graphics
                Graphics g = getGraphics();

                // set the color
                g.setColor(new Color(0x2279ac));

                // set the shape
                g.fillOval(e.getX(), e.getY(),20,20);
            }
        });
    }
}
