package patterns.factoryMethod.ex2;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        Warrior warrior = Warrior.createWarrior(4) ;

        System.out.println(warrior.getClass());
    }
}
