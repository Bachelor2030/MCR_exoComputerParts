public abstract class DiscountedPart extends Part {

    private static double pricePercent = 1.0;

    public DiscountedPart(double price) {
        super(price);
    }

    public static double getDiscountPercent() {
        return pricePercent;
    }

    public static void setDiscountPercent(double newDiscount) {
        pricePercent = newDiscount;
    }

    @Override
    public double getPrice() {
        return getDiscountPercent() * super.getPrice();
    }
}