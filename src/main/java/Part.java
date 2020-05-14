/**
 * Class Part which represents a computer part
 */
public abstract class Part {
    // The price of the current Part
    private double price;

    /**
     * Part constructor, creates a Part with the given price
     * @param price (double) the price of the current Part
     */
    public Part(double price) {
        this.price = price;
    }

    /**
     * Method used to get the price of the current Part
     * @return price (double) the price of the Part
     */
    public double getPrice() {
        return price;
    }
}
