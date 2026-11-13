package vazifa2.after;

public class NoDiscount implements DiscountStrategy {
    @Override public double apply(double price) { return price * 1.00; }
    @Override public String getName() { return "Chegirmasiz"; }
}
