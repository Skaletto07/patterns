package patterns.abstractFactory.ex1;

import patterns.abstractFactory.ex1.theme.GuiFactory;
import patterns.abstractFactory.ex1.theme.ScrollBar;
import patterns.abstractFactory.ex1.theme.blackTheme.JatBlackFactory;
import patterns.abstractFactory.ex1.theme.roseTheme.JatRoseGoldFactory;

public class Main2 {
    private static GuiFactory guiFactory;

    public static void main(String[] args) {
        int style = 1;

        switch (style) {
            case 1:
                guiFactory = new JatBlackFactory();
                break;
            case 2:
                guiFactory = new JatRoseGoldFactory();
                break;
        }

        ScrollBar scrollBar = guiFactory.createScrollBar();
        scrollBar.scrollTo(199);
    }
}
