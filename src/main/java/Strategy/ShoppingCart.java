package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Integer> items = new ArrayList<>();

    public void addItem(int price) {
        items.add(price);
    }

    public int calculateTotal() {
        int sum = 0;
        for (int price : items) {
            sum += price;
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
