package patterns.builder.basket;

public class SomeMarket extends BasketBuilder {
    @Override
    void buildName() {
        basket.setName("Magnit on mira street");
    }

    @Override
    void buildVolume() {
        basket.setVolume(30.0);
    }

    @Override
    void buildMeat() {
        basket.setMeat(2.5);
    }

    @Override
    void buildMilk() {
        basket.setMilk(0.950);
    }

    @Override
    void buildBread() {
        basket.setBread(1.5);
    }

    @Override
    void buildVegetables() {
        basket.setVegetables(3.0);
    }

    @Override
    void buildSomethingElse() {
        basket.setSomethingElse(1.8);
    }
}
