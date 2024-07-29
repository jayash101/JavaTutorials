package NoLayout;
import javax.swing.*;

public class no_layout extends JFrame{
    public no_layout(){
        setTitle("Absolute Positioning Title");
        setSize(300 ,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton button = new JButton("Button");
        button.setBounds(50, 50, 100, 30);
        panel.add(button);

        add(panel);
        setVisible(true);
    }
}
