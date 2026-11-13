package vazifa1.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** SRP: faqat buyurtma (mahsulotlar va jami summa). */
public class Order {
    private final String customerEmail;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(String customerEmail) { this.customerEmail = customerEmail; }
    public void addItem(OrderItem item) { items.add(item); }
    public List<OrderItem> getItems() { return Collections.unmodifiableList(items); }
    public String getCustomerEmail() { return customerEmail; }
    public double getTotal() {
        double sum = 0;
        for (OrderItem i : items) sum += i.getPrice();
        return sum;
    }
}
