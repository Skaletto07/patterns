package patterns.factoryMethod.ex3;

public class Archer extends Warrior {
    @Override
    public Weapon getWeapon() {
        return new Bow();
    }
}
