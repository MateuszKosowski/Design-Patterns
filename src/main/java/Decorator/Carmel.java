package Decorator;

class Carmel extends CoffeeDecorator {

    public Carmel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }
}