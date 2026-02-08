package Decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
}
