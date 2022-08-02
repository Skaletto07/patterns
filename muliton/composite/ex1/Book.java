package patterns.muliton.composite.ex1;

public class Book extends BookComponent {
    String Isdn;
    String name;
    String author;
    int price;

    public Book(String name) {
        this.name = name;
    }

    public Book(String isdn, String name, String author) {
        Isdn = isdn;
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author) {
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void about() {
        showLevel();
        System.out.println(toString());
    }
}
