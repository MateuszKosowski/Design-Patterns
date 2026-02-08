package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        myCoffee = new Carmel(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        myCoffee = new Discount(myCoffee, 0.2);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());
    }
}
