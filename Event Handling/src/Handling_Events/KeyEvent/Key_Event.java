package Handling_Events.KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key_Event extends JFrame {
    Key_Event(){
        // JFrame
        this.setTitle("Key Event Example");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // JLabel
        JLabel label = new JLabel();
        label.setBounds(100, 50, 200, 20);

        // JTextArea
        JTextArea area = new JTextArea();
        area.setBounds(100, 100, 200, 100);
        this.add(area);
        this.add(label);

        // Using KeyListener for counting the number of words
        area.addKeyListener(new KeyListener() {
            @Override
            public void keyReleased(KeyEvent e){
                // create string object to get the text from textarea
                String text = area.getText();

                // split the string into words
                String[] words = text.split("\\s");

                // print the number of words and characters of given string
                label.setText("Words: " + words.length + " Character: " + text.length());
            }

            @Override
            public void keyTyped(KeyEvent e){}

            @Override
            public void keyPressed(KeyEvent e){}
        });
    }
}
