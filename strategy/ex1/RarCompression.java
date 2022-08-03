package patterns.strategy.ex1;

public class RarCompression implements Compression {
    @Override
    public void compress(String file) {
        System.out.println("Rar DONE: " + file);
    }
}
