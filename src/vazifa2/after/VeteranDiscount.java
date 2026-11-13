package vazifa2.after;

public class VeteranDiscount implements DiscountStrategy {
    @Override public double apply(double price) { return price * 0.85; }
    @Override public String getName() { return "Faxriy chegirmasi (15%)"; }
}
