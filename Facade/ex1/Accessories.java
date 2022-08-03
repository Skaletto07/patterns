package patterns.Facade.ex1;

public class Accessories {
    public static Accessories createAccessory(int i) {
        return switch (i) {
            case 1 -> new HDD();
            case 2 -> new CPU();
            case 3 -> new Memory();
            default -> throw new RuntimeException("did not choose a warrior");
        };
    }

}
