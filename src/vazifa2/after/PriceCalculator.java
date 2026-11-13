package vazifa2.after;

/** OCP: bu sinf yangi strategiya qo'shilsa ham o'zgarmaydi. */
public class PriceCalculator {
    private DiscountStrategy strategy;
    public PriceCalculator(DiscountStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(DiscountStrategy strategy) { this.strategy = strategy; }
    public double calculate(double originalPrice) {
        double result = strategy.apply(originalPrice);
        System.out.printf("%-32s: %,10.0f -> %,10.0f so'm%n", strategy.getName(), originalPrice, result);
        return result;
    }
}
