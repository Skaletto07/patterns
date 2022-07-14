package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        Water water = Water.getInstance();
        System.out.println(water);

        Water water1 = Water.getInstance();
        System.out.println(water1);



    }
}
