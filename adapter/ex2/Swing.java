package patterns.adapter.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Swing extends JFrame {
    public Swing() throws HeadlessException {
        setSize(400,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                System.out.println("Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        Swing swing = new Swing();

    }
}
