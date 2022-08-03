package patterns.Facade.ex2;

public class Car {
    public static void main(String[] args) {
        Auto auto = new Auto(new Transmissiom(), new Clutch());
        auto.drive();
        auto.up();

    }
}
