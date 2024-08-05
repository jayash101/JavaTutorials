// Q. Write a GUI program using swing component to find number of words and characters in a textarea.

package Examples.Program3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program3 extends JFrame {
    public Program3() {
        // JFrame
        this.setTitle("Word and Character Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLayout(new GridLayout(2, 1));
        this.setVisible(true);

        // JTextArea
        JTextArea area = new JTextArea();
        area.setBounds(100, 100, 100, 20);

        // JLabel
        JLabel label = new JLabel();
        label.setBounds(100, 50, 200, 50);
        label.setText("So Empty!!!");

        this.add(label);
        this.add(area);

        // KeyListener to count number of words
        area.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                // get the text from input field
                String text = area.getText();

                // convert the text string into characters
                String[] words = text.split("\\s");

                // count the text and characters and show them in output
                label.setText("Words: " + words.length + ", Characters: " + text.length());

                if(text.isEmpty()){
                    label.setText("So Empty!!!");
                }
            }
        });
    }


}
