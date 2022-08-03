package patterns.adapter.ex1;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Adapter(new FahrenheitSensor());
        System.out.println("Degree temp: " + sensor.getTemperature());
    }
}
