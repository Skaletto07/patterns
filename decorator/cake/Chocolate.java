package patterns.decorator.cake;

public class Chocolate extends Goodies {

    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 10 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " with chocolate poured ";
    }
}
