// Q. Write a GUI program using components to find sum and difference of two numbers. Use two text fields for giving
// input and a label for output. The program should display sum if user presses mouse and difference if user releases
// mouse.

package Examples.Program5;

import  java.awt.*;
import  java.awt.event.*;
import javax.swing.*;

public class Program5 extends JFrame {
    Program5() {
        // JFrame
        this.setTitle("Program 5");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // First number
        JLabel number1_label = new JLabel("First number: ");
        JTextField number1_textfield = new JTextField(10);

        // Second number
        JLabel number2_label = new JLabel("Second number: ");
        JTextField number2_textfield = new JTextField(10);

        // Sum Label
        JLabel sum_label = new JLabel("Enter the information");

    }
}
