package Adapter;

public class AmericanToMetricAdapter implements MetricSensor{

    private AmericanSensor americanSensor;

    public AmericanToMetricAdapter(AmericanSensor americanSensor) {
        this.americanSensor = americanSensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        double tempF = americanSensor.getTemperatureInFahrenheit();
        double celsius = (tempF - 32) * 5.0 / 9.0;
        System.out.println("Adapter: Converting " + tempF + "°F to " + celsius + "°C");
        return celsius;
    }

}
