package AdapterClasses.WindowAdapter;

import javax.swing.*;
import java.awt.event.*;

public class Window_Adapter extends JFrame {
    Window_Adapter(){
        this.setTitle("WindowAdapter Example");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // WindowAdapter
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e){
                System.out.println("Window is opening...");
            }

            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Window is closing...");
                System.exit(0);
            }
        });
    }
}
