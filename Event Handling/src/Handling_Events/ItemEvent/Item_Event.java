package Handling_Events.ItemEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Item_Event extends JFrame {
    Item_Event(){
        // JFrame
        this.setTitle("Item Event Example");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // Item Event
        JComboBox<String> combo_box = new JComboBox<>();
        combo_box.setBounds(100, 100, 100, 30);
        combo_box.addItem("Option 1");
        combo_box.addItem("Option 2");
        combo_box.addItem("Option 3");

        combo_box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.DESELECTED) {
                    JOptionPane.showMessageDialog(null, "Deselected Item: " + e.getItem());
                }
                else if(e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(null, "Selected Item: " + e.getItem());
                }
            }
        });

        this.add(combo_box);
    }
}
