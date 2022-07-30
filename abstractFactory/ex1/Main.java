package patterns.abstractFactory.ex1;

import patterns.abstractFactory.ex1.theme.*;
import patterns.abstractFactory.ex1.theme.blackTheme.JatBlackFactory;

public class Main {
    private static GuiFactory guiFactory = new JatBlackFactory();

    public static void main(String[] args) {
//        ScrollBar scrollBar = new JatBlackScrollbar();
//        Button button = new JetBlackButton();
//        TextArea textArea = new JetBlackTextArea();


        ScrollBar scrollBar = guiFactory.createScrollBar();
        Button button = guiFactory.createButton();
        TextArea textArea = guiFactory.createTextArea();

        scrollBar.scrollTo(100);
    }
}
