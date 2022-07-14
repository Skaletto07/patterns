package patterns.factoryMethod.shops;

public class JewelryStore implements Store {
    @Override
    public void saleGood() {
        System.out.println("Beautiful jewelry!");
    }
}
