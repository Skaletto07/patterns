package patterns.factoryMethod.shops;

public class StoreCosmetics implements Store {
    @Override
    public void saleGood() {
        System.out.println("You look pretty!");
    }
}
