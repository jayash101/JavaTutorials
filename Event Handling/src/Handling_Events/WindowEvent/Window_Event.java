package Handling_Events.WindowEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Window_Event extends JFrame {
    Window_Event(){
        this.setTitle("WindowAdapter Example");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // WindowAdapter
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e){
                System.out.println("Window is opening...");
            }

            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Window is closing...");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}