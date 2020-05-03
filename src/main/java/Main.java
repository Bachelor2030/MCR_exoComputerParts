import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(75);

        parts.add(new CPU(330));
        parts.add(new CPU(450));
        parts.add(new CPU(42));
        parts.add(new CPU(420));
        parts.add(new CPU(210));
        parts.add(new CPU(999));

        parts.add(new RAM(154));
        parts.add(new RAM(176));
        parts.add(new RAM(145));
        parts.add(new RAM(264));
        parts.add(new RAM(210));
        parts.add(new RAM(10));


        for (Part p : parts)
            total += p.getPrice();

        System.out.println(total);

    }
}
