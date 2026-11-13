package vazifa2.after;

/** OCP: chegirma strategiyasi interfeysi. */
public interface DiscountStrategy {
    double apply(double price);
    String getName();
}
