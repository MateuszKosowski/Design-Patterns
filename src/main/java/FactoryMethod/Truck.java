package FactoryMethod;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Truck is delivering the package");
    }
}
