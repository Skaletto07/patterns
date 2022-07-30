package patterns.factoryMethod.ex3;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Archer();
        System.out.println(warrior.getWeapon().getClass());

    }
}
