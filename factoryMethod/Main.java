package patterns.factoryMethod;

import patterns.factoryMethod.shops.*;

public class Main {
    public static void main(String[] args) {

        StoreFactory factory = new GroceryStoreFactory();
        Store groceryStore = factory.createStore();
        groceryStore.saleGood();

        StoreFactory factory1 = new PharmacyFactory();
        Store pharmacy = factory1.createStore();
        pharmacy.saleGood();

        StoreFactory factory2 = new StoreCosmeticsFactory();
        Store cosmetics = factory2.createStore();
        cosmetics.saleGood();

        StoreFactory factory3 = new BuildingMaterialsStoreFactory();
        Store buildingMaterialsStore = factory3.createStore();
        buildingMaterialsStore.saleGood();

        StoreFactory factory4 = new JewelryStoreFactory();
        Store jewelry = factory4.createStore();
        jewelry.saleGood();

    }
}
