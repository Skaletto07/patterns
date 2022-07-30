package patterns.iterator.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String name) {
        books.add(new Book("----", name, "unknown"));
    }

    public void addBook(String name, String author) {
        books.add(new Book("----", name, author));
    }

    public Iterator<Book> createIterator() {
        return new BookShelfIterator(books);
    }


}
