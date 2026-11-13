package vazifa2.after;

public class SeasonalDiscount implements DiscountStrategy {
    @Override public double apply(double price) { return price * 0.80; }
    @Override public String getName() { return "Mavsumiy chegirma (20%)"; }
}
