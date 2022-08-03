package patterns.strategy.ex3;

public class Bird extends Animal {

    public Bird() {
        flyableStrategy = new ItFly();
    }
}
