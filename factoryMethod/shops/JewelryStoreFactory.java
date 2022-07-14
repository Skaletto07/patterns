package patterns.factoryMethod.shops;

public class JewelryStoreFactory implements StoreFactory {
    @Override
    public Store createStore() {
        return new JewelryStore();
    }
}
