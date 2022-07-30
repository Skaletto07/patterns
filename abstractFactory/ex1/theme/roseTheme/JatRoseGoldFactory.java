package patterns.abstractFactory.ex1.theme.roseTheme;

import patterns.abstractFactory.ex1.theme.Button;
import patterns.abstractFactory.ex1.theme.GuiFactory;
import patterns.abstractFactory.ex1.theme.ScrollBar;
import patterns.abstractFactory.ex1.theme.TextArea;
public class JatRoseGoldFactory extends GuiFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new RoseGoldScrollbar();
    }

    @Override
    public Button createButton() {
        return new RoseGoldButton();
    }

    @Override
    public TextArea createTextArea() {
        return new RoseGoldTextArea();
    }
}
