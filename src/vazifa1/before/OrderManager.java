package vazifa1.before;

import java.util.ArrayList;
import java.util.List;

/** BEFORE: God class - SRP buzilgan (buyurtma + hisob-faktura + email). */
public class OrderManager {
    private final List<String> names = new ArrayList<>();
    private final List<Double> prices = new ArrayList<>();
    private final String customerEmail;

    public OrderManager(String customerEmail) { this.customerEmail = customerEmail; }

    // 1) buyurtma logikasi
    public void addItem(String name, double price) { names.add(name); prices.add(price); }
    public double getTotal() { double s = 0; for (double p : prices) s += p; return s; }

    // 2) hisob-faktura logikasi
    public String generateInvoice() {
        StringBuilder sb = new StringBuilder("HISOB-FAKTURA\n");
        for (int i = 0; i < names.size(); i++)
            sb.append(String.format("  %-12s %,10.0f so'm%n", names.get(i), prices.get(i)));
        sb.append(String.format("  JAMI: %,.0f so'm", getTotal()));
        return sb.toString();
    }

    // 3) email logikasi
    public void sendInvoiceEmail() {
        System.out.println("Email -> " + customerEmail + "\n" + generateInvoice());
    }
}
