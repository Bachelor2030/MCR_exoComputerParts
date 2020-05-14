public class BlueCPU extends CPU {
    /**
     * CPU constructor which creates a CPU with the given original price
     *
     * @param price (double) the original price of the CPU
     * @param model (String) the model of the part
     */
    public BlueCPU(double price, String model) {
        super(price, model);
    }

    @Override
    public String toString() {
        return "Blue " + super.toString();
    }
}
