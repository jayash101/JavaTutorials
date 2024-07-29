package GUI_Controls.JPopUpMenu;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenu extends JFrame {
    PopupMenu(){
        this.setTitle("JPopUpMenu Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new SpringLayout());
        this.setVisible(true);

        // Popup menu
        JPopupMenu popup_menu = new JPopupMenu("Edit");

        // Menu Items
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        // Adding items to the popup menu
        popup_menu.add(cut);
        popup_menu.add(copy);
        popup_menu.add(paste);

        // Mouse click event (will be explored later in the chapter)
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popup_menu.show(new JFrame(), e.getX(), e.getY());
            }
        });

        // Add popup menu to JFrame
        this.add(popup_menu);
    }
}
