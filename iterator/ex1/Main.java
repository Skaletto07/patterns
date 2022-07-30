package patterns.iterator.ex1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("3452345", "Kapitanskaya dochka", "Pushkin A. S.");
//        System.out.println(book);

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Master");
        bookShelf.addBook("Pushkin");
        bookShelf.addBook("Book3", "Pushkin");
        bookShelf.addBook("Book4", "Pushkin");

        Iterator<Book> iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book1 = iterator.next();
            System.out.println("/------------------------\\");
            System.out.println("Book: " + book1.Isdn + " " + book1.name + " " + book1.author);
            System.out.println("\\------------------------/");
            System.out.println();
        }
    }
}
