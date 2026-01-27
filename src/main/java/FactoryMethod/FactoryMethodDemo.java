package FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        Logistics land = new LandLogistics();
        land.startDelivery();

        Logistics sea = new SeaLogistics();
        sea.startDelivery();

        // Dzięki metodzie fabryki w łatwy sposób można dodac nowy środek transportowy
    }
}
