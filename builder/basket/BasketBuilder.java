package patterns.builder.basket;

public abstract class BasketBuilder {

    BasketInMarket basket;

    public void createBasket() {
        basket = new BasketInMarket();
    }

    abstract void buildName();
    abstract void buildVolume();
    abstract void buildMeat();
    abstract void buildMilk();
    abstract void buildBread();
    abstract void buildVegetables();
    abstract void buildSomethingElse();

    public BasketInMarket getBasket() {
        return basket;
    }
}
