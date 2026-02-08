package Adapter;

// Adaptee
class AmericanSensor {
    public double getTemperatureInFahrenheit() {
        System.out.println("AmericanSensor: Measuring... returning 100°F");
        return 100.0;
    }
}