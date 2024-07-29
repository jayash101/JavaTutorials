package GUI_Controls.JMenu;

import javax.swing.*;

public class Menu extends JFrame {
    Menu(){
        this.setTitle("JMenu Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new SpringLayout());
        this.setVisible(true);

        // JMenuBar
        JMenuBar menu_bar = new JMenuBar();

        // JMenu
        JMenu menu = new JMenu("Menu");
        JMenu sub_menu = new JMenu("Sub Menu");

        // JMenuItem
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");
        JMenuItem item4 = new JMenuItem("Item 4");
        JMenuItem item5 = new JMenuItem("Item 5");

        JMenuItem[] items = {item1, item2, item3, item4, item5};

        // Add items 1,2,3 to menu
        for(int i = 0 ; i < 3; i++){
            menu.add(items[i]);
        }

        // Add items 4,5 to sub menu
        for (int i = 3; i < items.length; i++) {
            sub_menu.add(items[i]);
        }

        // Add sub menu to menu
        menu.add(sub_menu);

        // Add menu to menu bar
        menu_bar.add(menu);

        // Add menu bar to JFrame
        this.add(menu_bar);
    }
}