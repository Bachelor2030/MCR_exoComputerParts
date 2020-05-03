import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PartsTest {
    @Test
    public void undiscountedCPUPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(1);

        // undiscounted CPU parts price: 2452
        parts.add(new CPU(330));
        parts.add(new CPU(450));
        parts.add(new CPU(42));
        parts.add(new CPU(420));
        parts.add(new CPU(211));
        parts.add(new CPU(999));

        for (Part p : parts)
            total += p.getPrice();

        assertEquals(2452, total);
    }

    @Test
    public void discountedCPUPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(0.5);

        // undiscounted CPU parts price: 2452
        parts.add(new CPU(330));
        parts.add(new CPU(450));
        parts.add(new CPU(42));
        parts.add(new CPU(420));
        parts.add(new CPU(211));
        parts.add(new CPU(999));

        for (Part p : parts)
            total += p.getPrice();

        assertEquals(1226, total);
    }

    @Test
    public void undiscountedCPUAndRAMPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(1);

        // undiscounted CPU parts price: 2451
        parts.add(new CPU(330));
        parts.add(new CPU(450));
        parts.add(new CPU(42));
        parts.add(new CPU(420));
        parts.add(new CPU(210));
        parts.add(new CPU(999));

        // undiscounted RAM parts price: 959
        parts.add(new RAM(154));
        parts.add(new RAM(176));
        parts.add(new RAM(145));
        parts.add(new RAM(264));
        parts.add(new RAM(210));
        parts.add(new RAM(10));


        // total undiscounted price: 3410
        for (Part p : parts)
            total += p.getPrice();

        assertEquals(3410, total);
    }

    @Test
    public void discountedCPUAndRAMPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(0.5);

        // undiscounted CPU parts price: 2450
        parts.add(new CPU(330));
        parts.add(new CPU(450));
        parts.add(new CPU(42));
        parts.add(new CPU(420));
        parts.add(new CPU(209));
        parts.add(new CPU(999));

        // undiscounted RAM parts price: 960
        parts.add(new RAM(154));
        parts.add(new RAM(176));
        parts.add(new RAM(145));
        parts.add(new RAM(265));
        parts.add(new RAM(210));
        parts.add(new RAM(10));


        // total undiscounted price: 3410
        for (Part p : parts)
            total += p.getPrice();

        assertEquals(1225 + 960, total);
    }
}
