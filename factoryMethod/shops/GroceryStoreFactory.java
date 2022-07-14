package patterns.factoryMethod.shops;

public class GroceryStoreFactory implements StoreFactory {
    @Override
    public Store createStore() {
        return new GroceryStore();
    }
}
