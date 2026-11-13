package vazifa2.after;

/** Yangi tur - mavjud kod o'zgarmadi! */
public class LoyaltyDiscount implements DiscountStrategy {
    private final int years;
    public LoyaltyDiscount(int yearsOfLoyalty) { this.years = yearsOfLoyalty; }
    @Override public double apply(double price) {
        double rate = Math.min(years * 0.02, 0.30); // har yil 2%, maksimum 30%
        return price * (1 - rate);
    }
    @Override public String getName() { return "Sodiqlik chegirmasi (" + years + " yil)"; }
}
