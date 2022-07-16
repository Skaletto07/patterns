package patterns.builder.industryUnit;

public class LightIndustrialUnitBuilder extends IndustrialBuilder {
    @Override
    void buildName() {
        industrialUnit.setName("LightIndustry");
    }

    @Override
    void buildTemperature() {
        industrialUnit.setTemperature(100.0f);
    }

    @Override
    void buildPressure() {
        industrialUnit.setPressure(10.0);
    }

    @Override
    void buildVoltage() {
        industrialUnit.setVoltage(220);
    }

    @Override
    void buildSupplierName() {
        industrialUnit.setSupplierName("First supplier");
    }

    @Override
    void buildOperationStatus() {
        industrialUnit.setStatus(OperatingStatus.OPERATING);
    }
}
