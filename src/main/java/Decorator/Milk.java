package Decorator;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}