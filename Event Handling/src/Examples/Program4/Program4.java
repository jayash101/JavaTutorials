// Q. Write a program using swing components to find simple interest. Use text fields for inputs and output. Your program
// should display the result when the user presses the button.

package Examples.Program4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program4 extends JFrame {
    Program4() {
        // JFrame
        this.setTitle("Simple Interest Calculator");
        this.setSize(350, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8,1));
        this.setVisible(true);

        // Principal
        JLabel principal_label = new JLabel("Principal (P):");
        JTextField principal_textfield = new JTextField(10);

        // Time
        JLabel time_label = new JLabel("Time (T):");
        JTextField time_textfield = new JTextField(10);

        // Rate
        JLabel rate_label = new JLabel("Rate (R):");
        JTextField rate_textfield = new JTextField(10);

        // JButton
        JButton calculate_button = new JButton("Calculate");

        // JResult
        JTextField result = new JTextField();
        result.setText("Calculate to find the simple interest");
        result.setEditable(false);

        this.add(principal_label);
        this.add(principal_textfield);
        this.add(time_label);
        this.add(time_textfield);
        this.add(rate_label);
        this.add(rate_textfield);
        this.add(calculate_button);
        this.add(result);

        // Calculation
        calculate_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double principal = Double.parseDouble(principal_textfield.getText());
                    double time = Double.parseDouble(time_textfield.getText());
                    double rate = Double.parseDouble(rate_textfield.getText());

                    double simple_interest = (principal * time * rate) / 100;

                    result.setText("Simple Interest: " + simple_interest);
                }
                catch (Exception error) {
                    result.setText("Error: " + error.getMessage());
                }
            }
        });
    }
}
