package patterns.Facade.ex1;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer((HDD)Accessories.createAccessory(1),
                (CPU) Accessories.createAccessory(2),
                (Memory) Accessories.createAccessory(3));
        computer.power();
    }
}
