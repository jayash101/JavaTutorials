package GUI_Controls.JSlider;

import javax.swing.*;
import java.awt.*;

public class Slider extends JFrame {
    Slider(){
        this.setTitle("JSlider Example");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);

        // JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);

        // minor tick spacing
        slider.setMinorTickSpacing(2);

        // major tick spacing
        slider.setMajorTickSpacing(10);

        // paint the ticks
        slider.setPaintTicks(true);

        // paint the labels
        slider.setPaintLabels(true);

        // Add to JFrame
        this.add(slider);
    }
}
