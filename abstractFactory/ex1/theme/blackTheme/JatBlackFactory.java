package patterns.abstractFactory.ex1.theme.blackTheme;

import patterns.abstractFactory.ex1.theme.Button;
import patterns.abstractFactory.ex1.theme.GuiFactory;
import patterns.abstractFactory.ex1.theme.ScrollBar;
import patterns.abstractFactory.ex1.theme.TextArea;

public class JatBlackFactory extends GuiFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new JatBlackScrollbar();
    }

    @Override
    public Button createButton() {
        return new JetBlackButton();
    }

    @Override
    public TextArea createTextArea() {
        return new JetBlackTextArea();
    }
}
