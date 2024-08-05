package GUI_Controls.JInternalFrame;

import javax.swing.*;
import java.awt.*;

public class JInternalFrame_Example extends JFrame {
    JInternalFrame_Example(){
        // JFrame
        this.setTitle("JInternalFrame Example");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // JDesktopPane
        JDesktopPane desktop_pane = new JDesktopPane();
        this.add(desktop_pane);

        // JInternalFrame
        JInternalFrame internal_frame = new JInternalFrame("JInternalFrame", true, true, true, true);
        internal_frame.setSize(400, 400);
        internal_frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        internal_frame.setLocation(50, 50);
        internal_frame.setVisible(true);
        desktop_pane.add(internal_frame);
    }
}
