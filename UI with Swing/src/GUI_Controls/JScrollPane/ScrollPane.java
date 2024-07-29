package GUI_Controls.JScrollPane;

import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JFrame {
    ScrollPane(){
        this.setTitle("JScrollPane Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600 ,600);
        this.setVisible(true);

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // JScrollPane
        JScrollPane scroll_pane = new JScrollPane(panel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Add JScrollPanel
        this.add(scroll_pane);
    }
}
