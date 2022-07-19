package patterns.decorator.cake;

import patterns.decorator.cake.Baking;

public class Cake implements Baking {
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Cake";
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " " + getPrice() + " y.e.");
    }
}
