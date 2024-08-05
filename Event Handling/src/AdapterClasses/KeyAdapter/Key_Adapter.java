package AdapterClasses.KeyAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key_Adapter extends JFrame {
    Key_Adapter(){
        // JFrame
        this.setTitle("KeyAdapter Example");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);
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

        // KeyAdapter
        area.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e){
                // create string object to get the text from textarea
                String text = area.getText();

                // split the string into words
                String[] words = text.split("\\s");

                // print the number of words and characters of given string
                label.setText("Words: " + words.length + " Character: " + text.length());
            }
        });
    }
}
