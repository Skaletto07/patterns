package patterns.strategy.ex3;

public class Animal {
    private String name;
    protected Flyable flyableStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flyable getFlyableStrategy() {
        return flyableStrategy;
    }

    public void setFlyable(Flyable flyableStrategy) {
        this.flyableStrategy = flyableStrategy;
    }

    public String fly() {
        return flyableStrategy.fly();
    }
}
