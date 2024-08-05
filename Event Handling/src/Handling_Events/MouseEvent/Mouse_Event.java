package Handling_Events.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Event extends JFrame {
    Mouse_Event(){
        // JFrame
        this.setTitle("Mouse Event Example");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // Using MouseEvent to display circle objects on mouse click
        this.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Create graphics
                Graphics g = getGraphics();

                // Set the color
                g.setColor(Color.pink);

                // Add mouse event to fill the color
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
}
