package patterns.factoryMethod.ex2;

public abstract class Warrior {
   public static Warrior createWarrior(int i) {
       return switch (i) {
           case 1 -> new Archer();
           case 2 -> new Horseman();
           case 3 -> new Infantryman();
           default -> throw new RuntimeException("did not choose a warrior");
       };
    }
}
