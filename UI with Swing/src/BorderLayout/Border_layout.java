package BorderLayout;
import java.awt.BorderLayout;
import javax.swing.*;

public class Border_layout extends JFrame {

    // constructor
    public Border_layout(){

        this.setTitle("Border Layout Example");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // creating buttons
        JButton button1 = new JButton("North Button");
        JButton button2 = new JButton("South Button");
        JButton button3 = new JButton("East Button");
        JButton button4 = new JButton("West Button");
        JButton button5 = new JButton("Center Button");

        // adding buttons to JFrame
        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.SOUTH);
        this.add(button3, BorderLayout.EAST);
        this.add(button4, BorderLayout.WEST);
        this.add(button5, BorderLayout.CENTER);
    }
}