package GUI_Controls.JPasswordField;

import javax.swing.*;

public class Password extends JFrame {
    Password(){
        this.setTitle("JPasswordField Example");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // JPasswordField
        JPasswordField password = new JPasswordField();
        password.setBounds(100, 100, 100, 20);

        // Label
        JLabel label = new JLabel("Password");
        label.setBounds(20, 100, 80, 20);

        this.add(label);
        this.add(password);
    }
}
