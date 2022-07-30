package patterns.abstractFactory.ex1.theme.blackTheme;

import patterns.abstractFactory.ex1.theme.ScrollBar;

public class JatBlackScrollbar extends ScrollBar {
    @Override
    public void scrollTo(int i) {
        System.out.println("JetBlack scrolling to " + i);
    }
}
