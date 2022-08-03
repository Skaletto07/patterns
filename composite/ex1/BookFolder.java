package patterns.composite.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookFolder extends BookComponent {
    ArrayList<BookComponent> bookComponents;
    String description;

    public BookFolder(String description) {
        this.description = description;
        bookComponents = new ArrayList<>();
    }

    @Override
    void add(BookComponent component) {
        bookComponents.add(component);
    }

    @Override
    void remove(BookComponent component) {
        bookComponents.remove(component);
    }

    @Override
    BookComponent getChild(int i) {
        return bookComponents.get(i);
    }

    @Override
    public void about() {
        showLevel();
        System.out.println("----" + description + "----");
        Iterator<BookComponent> iterator = bookComponents.iterator();
        while (iterator.hasNext()) {
            BookComponent bookComponent = iterator.next();
            bookComponent.about(level + 1);
        }
    }
}
