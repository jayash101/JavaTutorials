package GUI_Controls.JTextArea;

import javax.swing.*;

public class J_Frame extends JFrame {
    J_Frame(){
        this.setTitle("JTextArea Example");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new J_TextArea());
        this.setLayout(null);
        this.setVisible(true);
    }
}
