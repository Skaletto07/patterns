package patterns.factoryMethod.shops;

public class Pharmacy implements Store {
    @Override
    public void saleGood() {
        System.out.println("Cheers!");
    }
}
