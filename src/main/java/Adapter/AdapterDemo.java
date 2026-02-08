package Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AmericanSensor americanDevice = new AmericanSensor();
        MetricSensor sensor = new AmericanToMetricAdapter(americanDevice);
        System.out.println("Client: Reading temperature...");
        double temp = sensor.getTemperatureInCelsius();
        System.out.println("Client: Current temp is " + temp + "°C");
    }
}
