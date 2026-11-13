package vazifa1;

import vazifa1.before.OrderManager;
import vazifa1.after.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== BEFORE: God class =====");
        OrderManager om = new OrderManager("gulruh@mail.uz");
        om.addItem("Kitob", 50_000);
        om.addItem("Daftar", 12_000);
        om.sendInvoiceEmail();

        System.out.println("\n===== AFTER: SRP =====");
        Order order = new Order("gulruh@mail.uz");
        order.addItem(new OrderItem("Kitob", 50_000));
        order.addItem(new OrderItem("Daftar", 12_000));
        String invoice = new InvoiceService().generate(order);
        new EmailService().send(order.getCustomerEmail(), invoice);
    }
}
