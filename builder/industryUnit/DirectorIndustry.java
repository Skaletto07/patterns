package patterns.builder.industryUnit;

public class DirectorIndustry {

    IndustrialBuilder builder;

    public void setBuilder(IndustrialBuilder builder) {
        this.builder = builder;
    }

    public IndustrialUnit buildIndustrialUnit() {
        builder.createIndustrial();
        builder.buildName();
        builder.buildTemperature();
        builder.buildPressure();
        builder.buildVoltage();
        builder.buildSupplierName();
        builder.buildOperationStatus();

        return builder.industrialUnit;
    }

}
