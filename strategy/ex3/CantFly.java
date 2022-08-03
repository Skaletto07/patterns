package patterns.strategy.ex3;

public class CantFly implements Flyable {
    @Override
    public String fly() {
//        throw new UnsupportedOperationException();
        return "i cant fly";
    }
}
