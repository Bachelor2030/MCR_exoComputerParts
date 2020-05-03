public class RAM extends Part {
    private static double discountPercent = 0;

    public RAM(double price) {
        super(price);
    }

    public static double getDiscountPercent() {
        return discountPercent;
    }

    public static void setDiscountPercent(double newDiscount) {
        discountPercent = newDiscount;
    }
}
