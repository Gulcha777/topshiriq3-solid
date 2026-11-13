package vazifa2.after;

public class StudentDiscount implements DiscountStrategy {
    @Override public double apply(double price) { return price * 0.90; }
    @Override public String getName() { return "Talaba chegirmasi (10%)"; }
}
