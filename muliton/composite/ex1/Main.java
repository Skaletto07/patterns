package patterns.muliton.composite.ex1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2", "Herbert Schildt");
        Book book3 = new Book("Book3", "Pushkin");
        Book book4 = new Book("Book4");

        BookFolder bookFolder = new BookFolder("Main folder");
        bookFolder.add(book1);
        bookFolder.add(book2);
        bookFolder.add(book3);
        bookFolder.add(book4);

        BookFolder subBookFolder = new BookFolder("Fantastic");
        subBookFolder.add(new Book("Dan Simmons", "Hyperion"));

        bookFolder.add(subBookFolder);

        BookFolder subBookFolder2 = new BookFolder("Science fantastic");
        subBookFolder2.add(new Book("Book11"));
        subBookFolder2.add(new Book("Book22"));
        subBookFolder2.add(new Book("Book33"));
        subBookFolder2.add(new Book("Book44"));

        subBookFolder.add(subBookFolder2);


        bookFolder.about();




    }
}
