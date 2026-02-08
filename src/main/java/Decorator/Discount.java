package Decorator;

class Discount extends CoffeeDecorator {
    private double discountPercentage;

    public Discount(Coffee coffee, double discountPercentage) {
        super(coffee);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getCost() {
        double originalCost = super.getCost();
        return originalCost * (1.0 - discountPercentage);
    }

    @Override
    public String getDescription() {
        int percent = (int)(discountPercentage * 100);
        return super.getDescription() + " (Discount " + percent + "%)";
    }
}

