package patterns.muliton.composite.ex1;

public abstract class BookComponent {
    int  level;

    void showLevel() {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
    }
    String getName() {
        throw new UnsupportedOperationException();
    }

    String getAuthor() {
        throw new UnsupportedOperationException();
    }

    void add(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    BookComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void about() {
        throw new UnsupportedOperationException();
    }

    public void about(int level) {
        this.level = level;
        about();
    }
}
