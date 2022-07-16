package patterns.builder.basket;

public class DirectorBasket {

    BasketBuilder builder;

    public void setBuilder(BasketBuilder builder) {
        this.builder = builder;
    }

    public BasketInMarket buildBasket() {
        builder.createBasket();

        builder.buildName();
        builder.buildVolume();
        builder.buildBread();
        builder.buildMeat();
        builder.buildMilk();
        builder.buildVegetables();
        builder.buildSomethingElse();

        return builder.basket;
    }
}
