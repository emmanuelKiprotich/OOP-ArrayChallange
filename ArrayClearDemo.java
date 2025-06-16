import java.util.Arrays;

public class ArrayClearDemo {
    public static void main(String[] args) {
        String[] pallets = { "C14", "A11", "B12", "D13", "G16", "F17", "E15" };

        System.out.println();

        // Print the first element in lowercase before clearing
        System.out.println("Before: " + pallets[0].toLowerCase());

        // Clear (set to null) the first 2 elements
        Arrays.fill(pallets, 0, 2, null);

        // Check and print the first element after clearing
        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        // Print the array length and its current content
        System.out.println("Clearing 2 ... count: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }
    }
}