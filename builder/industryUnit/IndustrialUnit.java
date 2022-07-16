package patterns.builder.industryUnit;

// Промышленный объект

public class IndustrialUnit {
    private String name;
    private float temperature;
    private double pressure;
    private int voltage;
    private String supplierName;
    private OperatingStatus status;

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setStatus(OperatingStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "IndustrialUnit{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", voltage=" + voltage +
                ", supplierName='" + supplierName + '\'' +
                ", status=" + status +
                '}';
    }
}
