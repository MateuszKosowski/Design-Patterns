package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(100);
        cart.addItem(250);

        System.out.println("--- Client chooses PayPal ---");
        cart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));

        System.out.println("\n--- Client chooses Credit Card ---");
        cart.pay(new CreditCardStrategy("John Doe", "1234-5678-9012-3456", "786"));
    }
}
