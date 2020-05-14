import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PartsTest {
    @Test
    public void undiscountedCPUPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(1);

        parts.add(new CPU(330, "U9TV"));
        parts.add(new CPU(450, "OJVM93"));
        parts.add(new CPU(42, "U983VIU"));
        parts.add(new CPU(420, "9W4V89V4"));
        parts.add(new CPU(210, "3V4T34B"));
        parts.add(new CPU(999, "WB3WBER"));

        for (Part p : parts)
            total += p.getPrice();

        assertEquals(2452, total);
    }

    @Test
    public void discountedCPUPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(0.5);

        parts.add(new CPU(330, "U9TV"));
        parts.add(new CPU(450, "OJVM93"));
        parts.add(new CPU(42, "U983VIU"));
        parts.add(new CPU(420, "9W4V89V4"));
        parts.add(new CPU(210, "3V4T34B"));
        parts.add(new CPU(999, "WB3WBER"));

        for (Part p : parts)
            total += p.getPrice();

        assertEquals(1226, total);
    }

    @Test
    public void undiscountedCPUAndRAMPriceShouldBeCorrect() {
        double total = 0;
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(1);


        parts.add(new CPU(330, "U9TV"));
        parts.add(new CPU(450, "OJVM93"));
        parts.add(new CPU(42, "U983VIU"));
        parts.add(new CPU(420, "9W4V89V4"));
        parts.add(new CPU(210, "3V4T34B"));
        parts.add(new CPU(999, "WB3WBER"));

        parts.add(new RAM(154, "W456EB"));
        parts.add(new RAM(176, "3C454V5"));
        parts.add(new RAM(145, "34CR34"));
        parts.add(new RAM(264, "345VT"));
        parts.add(new RAM(210, "E4C34"));
        parts.add(new RAM(10, "F34FWE"));


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

        parts.add(new CPU(330, "U9TV"));
        parts.add(new CPU(450, "OJVM93"));
        parts.add(new CPU(42, "U983VIU"));
        parts.add(new CPU(420, "9W4V89V4"));
        parts.add(new CPU(210, "3V4T34B"));
        parts.add(new CPU(999, "WB3WBER"));

        parts.add(new RAM(154, "W456EB"));
        parts.add(new RAM(176, "3C454V5"));
        parts.add(new RAM(145, "34CR34"));
        parts.add(new RAM(264, "345VT"));
        parts.add(new RAM(210, "E4C34"));
        parts.add(new RAM(10, "F34FWE"));


        // total undiscounted price: 3410
        for (Part p : parts)
            total += p.getPrice();

        assertEquals(1225 + 960, total);
    }
}
