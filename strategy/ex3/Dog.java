package patterns.strategy.ex3;

public class Dog extends Animal {

    public Dog() {
        flyableStrategy = new CantFly();
    }
}
