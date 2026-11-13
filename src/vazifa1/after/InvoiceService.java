package vazifa1.after;

/** SRP: faqat hisob-faktura yaratish. */
public class InvoiceService {
    public String generate(Order order) {
        StringBuilder sb = new StringBuilder("HISOB-FAKTURA\n");
        for (OrderItem i : order.getItems())
            sb.append(String.format("  %-12s %,10.0f so'm%n", i.getName(), i.getPrice()));
        sb.append(String.format("  JAMI: %,.0f so'm", order.getTotal()));
        return sb.toString();
    }
}
