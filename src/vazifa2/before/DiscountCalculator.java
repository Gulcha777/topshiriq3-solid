package vazifa2.before;

/** BEFORE: OCP buzilgan - yangi tur qo'shilsa sinf o'zgaradi. */
public class DiscountCalculator {
    public double calculate(String type, double price) {
        if (type.equals("NONE")) return price;
        else if (type.equals("STUDENT")) return price * 0.90;
        else if (type.equals("VETERAN")) return price * 0.85;
        else if (type.equals("SEASONAL")) return price * 0.80;
        else throw new IllegalArgumentException("Noma'lum tur: " + type);
    }
}
