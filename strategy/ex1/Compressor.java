package patterns.strategy.ex1;

public class Compressor {
    private Compression compression;

    public Compressor(Compression compression) {
        this.compression = compression;
    }

    public void compress(String file) {
        compression.compress(file);
    }
}
