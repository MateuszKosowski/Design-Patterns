package Decorator;

abstract class CoffeeDecorator implements Coffee{
    protected Coffee tempCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.tempCoffee = coffee;
    }

    @Override
    public double getCost() {
        return tempCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return tempCoffee.getDescription();
    }
}
