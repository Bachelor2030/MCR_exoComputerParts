/**
 * Class Part which represents a computer part
 */
public abstract class Part {
    // The price of the current Part
    private double price;
    // The model of the part
    private String model;

    /**
     * Part constructor, creates a Part with the given price
     * @param price (double) the price of the current Part
     * @param model (String) the model of the part
     */
    public Part(double price, String model) {
        this.price = price;
        this.model = model;
    }

    /**
     * Method used to get the price of the current Part
     * @return price (double) the price of the Part
     */
    public double getPrice() {
        return price;
    }
}
