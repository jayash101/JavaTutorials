package GUI_Controls.JPanel;

import javax.swing.*;
import java.awt.*;

public class JPanel_Example extends JFrame {
    JPanel_Example(){
        // JFrame
        this.setTitle("JPanel Example");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // JPanel
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(new Color(0xf376a2));

        // Add panel to JFrame
        this.add(panel);
    }
}
