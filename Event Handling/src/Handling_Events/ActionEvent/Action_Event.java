package Handling_Events.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Action_Event extends JFrame{

    private int count = 0;

    Action_Event(){
        this.setTitle("Button Example");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 100, 30);

        JLabel label = new JLabel("This button is clicked " + count + " times");
        label.setBounds(50, 130, 200, 30);

        // Using ActionEvent
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("This button is clicked " + count + " times");
            }
        });

        this.add(button);
        this.add(label);
    }
}
