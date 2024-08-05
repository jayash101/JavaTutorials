// Write a program using swing components to add two numbers. Use text fields for inputs and output. Your program should display the result when the user presses a button.

package Examples.Program1;
import javax.swing.*;

public class Program1 extends JFrame {
    Program1() {

        // JFrame
        this.setTitle("Program");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // input 1
        JLabel number1 = new JLabel("First number:");
        number1.setBounds(50, 100, 100, 20);

        JTextField number1_textfield = new JTextField(10);
        number1_textfield.setBounds(50, 125, 100, 20);

        this.add(number1);
        this.add(number1_textfield);


        // input 2
        JLabel number2 = new JLabel("Second number:");
        number2.setBounds(50, 150, 100, 20);

        JTextField number2_textfield = new JTextField(10);
        number2_textfield.setBounds(50, 175, 100, 20);

        this.add(number2);
        this.add(number2_textfield);


        // button
        JButton button = new JButton("Submit");
        button.setBounds(50, 200, 100, 20);
        this.add(button);

        // output
        JTextField output = new JTextField(10);
        output.setBounds(50, 250, 100, 20);
        this.add(output);
        output.setVisible(false);


        // Event Handling
        button.addActionListener(e -> {
            if(e.getSource() == button){
                int num1 = Integer.parseInt(number1_textfield.getText());
                int num2 = Integer.parseInt(number2_textfield.getText());

                int sum = num1 + num2;

                output.setText(String.valueOf(sum));
                output.setVisible(true);
            }
        });
    }
}

