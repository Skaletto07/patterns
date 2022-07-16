package patterns.builder.industryUnit;

public class HeavyIndustrialUnitBuilder extends IndustrialBuilder {
    @Override
    void buildName() {
        industrialUnit.setName("Black metallurgy");
    }

    @Override
    void buildTemperature() {
        industrialUnit.setTemperature(700.0f);
    }

    @Override
    void buildPressure() {
        industrialUnit.setPressure(250.0);
    }

    @Override
    void buildVoltage() {
        industrialUnit.setVoltage(360);
    }

    @Override
    void buildSupplierName() {
        industrialUnit.setSupplierName("Someone");
    }

    @Override
    void buildOperationStatus() {
        industrialUnit.setStatus(OperatingStatus.OPERATING);
    }
}
