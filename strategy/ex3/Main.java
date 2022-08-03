package patterns.strategy.ex3;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Bird();

        System.out.println("Bird: " + animal2.fly());
        System.out.println("Dog: " + animal1.fly());
    }
}
