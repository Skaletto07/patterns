package patterns.template.ex2;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public MyJFrame() throws HeadlessException {
        super("Template method!");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(50,50,200,200);
        g.drawString("Learn Java", 100, 100);
    }

    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame();
    }
}
