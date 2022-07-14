package patterns.factoryMethod.shops;

public class StoreCosmeticsFactory implements StoreFactory {
    @Override
    public Store createStore() {
        return new StoreCosmetics();
    }
}
