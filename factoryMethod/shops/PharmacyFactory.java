package patterns.factoryMethod.shops;

public class PharmacyFactory implements StoreFactory {
    @Override
    public Store createStore() {
       return new Pharmacy();
    }
}
