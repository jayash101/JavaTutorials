package GUI_Controls.JTextField;

import javax.swing.*;
import java.awt.*;

public class J_Frame extends JFrame {
    J_Frame(){
        this.setTitle("JTextField Example");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(new J_Textfield("Email address"));

    }
}
