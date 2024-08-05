package Handling_Events.FocusEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Focus_Event extends JFrame {
    Focus_Event(){
        // JFrame
        this.setTitle("Focus Event Example");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // Focus Event
        JTextField text_field = new JTextField();
        text_field.setBounds(100, 100, 100, 20);

        JButton button = new JButton("Click");
        button.setBounds(100, 130, 100, 20);

        button.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                text_field.setBackground(Color.red);
            }

            @Override
            public void focusLost(FocusEvent e) {
                text_field.setBackground(Color.white);
            }
        });

        this.add(text_field);
        this.add(button);
    }
}
