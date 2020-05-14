import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // A list of parts
        ArrayList<Part> parts = new ArrayList<Part>();

        CPU.setDiscountPercent(0.10);

        parts.add(new CPU(330, "U9TV"));
        parts.add(new CPU(450, "OJVM93"));
        parts.add(new CPU(42, "U983VIU"));
        parts.add(new CPU(420, "9W4V89V4"));
        parts.add(new CPU(210, "3V4T34B"));
        parts.add(new CPU(999, "WB3WBER"));

        parts.add(new BlueCPU(999, "I'M BLUE DABOUDI DABOUDA"));

        parts.add(new RAM(154, "W456EB"));
        parts.add(new RAM(176, "3C454V5"));
        parts.add(new RAM(145, "34CR34"));
        parts.add(new RAM(264, "345VT"));
        parts.add(new RAM(210, "E4C34"));
        parts.add(new RAM(10, "F34FWE"));


        for (Part p : parts) {
            System.out.println(p + "\n");
        }
    }
}
