package FactoryMethod;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void startDelivery(){
        Transport transport = createTransport();
        System.out.println("Delivery started");
        transport.deliver();
    }
}
