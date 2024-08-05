package GUI_Controls.FileChooser;

import javax.swing.*;

public class FileChooser_Example extends JFrame {
    FileChooser_Example(){
        // JFrame
        this.setTitle("FileChooser Example");
        this.setSize(400, 400);
        this.setLayout(new SpringLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // JFileChooser
        JFileChooser file_chooser = new JFileChooser();
        file_chooser.showOpenDialog(this);
    }
}