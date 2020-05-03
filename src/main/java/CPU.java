public class CPU extends Part {
    private static Discount discount;

    public CPU(double price) {
        super(price);
    }

    public static double getDiscountPercent() {
        return discount.getPercent();
    }

    public static void setDiscountPercent(Discount newDiscount) {
        discount = newDiscount;
    }
}
