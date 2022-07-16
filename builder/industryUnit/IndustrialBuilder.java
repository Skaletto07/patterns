package patterns.builder.industryUnit;

public abstract class IndustrialBuilder {

    IndustrialUnit industrialUnit;

    public void createIndustrial() {
        industrialUnit = new IndustrialUnit();
    }

    abstract void buildName();
    abstract void buildTemperature();
    abstract void buildPressure();
    abstract void buildVoltage();
    abstract void buildSupplierName();
    abstract void buildOperationStatus();

    public IndustrialUnit getIndustrialUnit() {
        return industrialUnit;
    }

}
