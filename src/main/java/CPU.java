/**
 * CPU class which represents a CPU that has a discount
 * Hence, it's extending DiscountedPart
 */
public class CPU extends DiscountedPart {
    /**
     * CPU constructor which creates a CPU with the given original price
     * @param price (double) the original price of the CPU
     */
    public CPU(double price) {
        super(price);
    }
}
