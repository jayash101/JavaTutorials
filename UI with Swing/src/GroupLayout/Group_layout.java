package GroupLayout;

import javax.swing.*;
import java.awt.*;

public class Group_layout extends JFrame {
    Group_layout(){
        this.setTitle("GroupLayout Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);

        // Creating container
        Container panel = this.getContentPane();

        // Set group layout
        GroupLayout layout = new GroupLayout(panel);
        this.setLayout(layout);

        // Creating label
        JLabel label = new JLabel("Click here ");

        // Creating button
        JButton button = new JButton("This button");

        // Set horizontal layout
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(10, 20, 30)    //gap between label and button
                        .addComponent(button)
        );

        // Set vertical layout
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(button)
        );
    }
}
