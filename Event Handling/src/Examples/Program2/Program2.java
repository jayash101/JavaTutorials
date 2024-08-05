// Q. Write a Java program to find the sum of two numbers using swing components. Use text fields for input and output. Your program
// should display output if you press any key in  keyboard. Use key adapter to handle events.
package Examples.Program2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program2 extends JFrame{

    // calculateSum method
    void calculateSum(JTextField num1Field, JTextField num2Field, JTextField resultField) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int sum = num1 + num2;
            resultField.setText(Integer.toString(sum));
        }
        catch (Exception e) {
            resultField.setText("Invalid input");
        }
    }

    // constructor
    public Program2() {
        // JFrame
        this.setTitle("Sum Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setLayout(new GridLayout(3, 2));

        // Inputs
        JLabel num1Label = new JLabel("Number 1:");
        JTextField num1Field = new JTextField();

        JLabel num2Label = new JLabel("Number 2:");
        JTextField num2Field = new JTextField();

        // Result
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Make the result field non-editable

        //Add all the components
        this.add(num1Label);
        this.add(num1Field);
        this.add(num2Label);
        this.add(num2Field);
        this.add(resultLabel);
        this.add(resultField);

        // Add key listener to any of the text fields
        num1Field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                calculateSum(num1Field, num2Field, resultField);
            }
        });

        num2Field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                calculateSum(num1Field, num2Field, resultField);
            }
        });

        this.setVisible(true);
    }
}
