package patterns.adapter.ex1;

public class Adapter extends Sensor {
    private final FahrenheitSensor fahrenheitSensor;

    public Adapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
    return (fahrenheitSensor.getFahrenheitTemp() - 32.0) * 5.0 / 9.0;
    }
}
