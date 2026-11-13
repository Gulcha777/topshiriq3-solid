package vazifa2;

import vazifa2.before.DiscountCalculator;
import vazifa2.after.*;

public class Main {
    public static void main(String[] args) {
        double price = 1_000_000;

        System.out.println("===== BEFORE: OCP buzilgan =====");
        DiscountCalculator calc = new DiscountCalculator();
        for (String t : new String[]{"NONE", "STUDENT", "VETERAN", "SEASONAL"})
            System.out.printf("%-9s: %,.0f%n", t, calc.calculate(t, price));

        System.out.println("\n===== AFTER: OCP + Strategy =====");
        PriceCalculator pc = new PriceCalculator(new NoDiscount());
        pc.calculate(price);
        pc.setStrategy(new StudentDiscount());  pc.calculate(price);
        pc.setStrategy(new VeteranDiscount());  pc.calculate(price);
        pc.setStrategy(new SeasonalDiscount()); pc.calculate(price);
        pc.setStrategy(new LoyaltyDiscount(5)); pc.calculate(price); // yangi tur
    }
}
