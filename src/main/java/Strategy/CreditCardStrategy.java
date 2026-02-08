package Strategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;

    public CreditCardStrategy(String name, String cardNumber, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Credit Card: " + cardNumber);
    }
}
