package patterns.factoryMethod.shops;

public class BuildingMaterialsStore implements Store {
    @Override
    public void saleGood() {
        System.out.println("Build safe!");
    }

}
