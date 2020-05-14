/**
 * DiscountedPart class, which extends Part
 * A DiscountedPart is a computer Part with a given discount on its price
 */
public abstract class DiscountedPart extends Part {
    // Residual price percentage of the part's price
    private static double pricePercent = 1.0;

    /**
     * DiscountedPart constructor, it creates a discounted part with the given non discounted price
     * @param price (double) the original price of the part
     * @param model (String) the model of the part
     */
    public DiscountedPart(double price, String model) {
        super(price, model);
    }

    /**
     * Method used to get the discount percentage of the part
     * @return pricePercent (double) the percentage of the price a buyer will have to pay
     */
    public static double getDiscountPercent() {
        return pricePercent;
    }

    /**
     * Method used to set the discount on the part
     * @param newDiscount (double) the new discount to add
     */
    public static void setDiscountPercent(double newDiscount) {
        pricePercent = newDiscount;
    }

    /**
     * Method used to get the price to pay for the current parrt
     * @return price (double) the total price to pay
     */
    @Override
    public double getPrice() {
        return getDiscountPercent() * super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Discounted price : " + getPrice();
    }
}