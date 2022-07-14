package patterns.factoryMethod.shops;

public class BuildingMaterialsStoreFactory implements StoreFactory {
    @Override
    public Store createStore() {
        return new BuildingMaterialsStore();
    }
}
