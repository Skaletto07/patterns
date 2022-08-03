package patterns.strategy.ex1;

public class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor(new ZipCompression());
        compressor.compress("war_and_peace.txt");
    }
}
