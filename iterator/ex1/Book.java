package patterns.iterator.ex1;

public class Book {
    String Isdn;
    String name;
    String author;

    public Book(String isdn, String name, String author) {
        Isdn = isdn;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Isdn='" + Isdn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
