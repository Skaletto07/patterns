package patterns.abstractFactory.ex1.theme.roseTheme;

import patterns.abstractFactory.ex1.theme.ScrollBar;

public class RoseGoldScrollbar extends ScrollBar {
    @Override
    public void scrollTo(int i) {
        System.out.println("JetRoseGold scrolling to " + i);
    }
}
