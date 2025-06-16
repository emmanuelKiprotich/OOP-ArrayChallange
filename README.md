# OOP-ArrayChallange


ARRAY CHALLENGE _ OOPII

EXERCISE 1 - Declaring an array and filtering the elements

public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        for (String item : orderIds) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }
    }
}



EXERCISE 1-Explanation

    public class ArrayChallenge

        -This defines a class named ArrayChallenge.

        -In Java, all code must be inside a class.

    public static void main(String[] args)

        -This is the entry point of any Java application.

       -When the program runs, execution starts here.

    String[] orderIds = {...}

        -Declares an array of strings called orderIds.

        The array holds a list of order identifiers like "B123", "C234", etc.

    for (String item : orderIds)

        -This is a for-each loop that goes through each element in the orderIds array.

        -On each loop, item holds one string from the array.

    if (item.startsWith("B"))

        -This checks if the current string (item) starts with the letter "B".

        -The startsWith() method returns true if the string begins with the specified prefix.

    System.out.println(item);

        -If the condition is true, this line prints the string to the console.


EXERCISE 2- 
/*
  The following code creates five random OrderIDs to test the fraud detection process.OrderIDs 
  consist of a letter from A to E, and a three digit number. Ex. A123.
*/

import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            // Generate a random uppercase letter between A (65) and E (69)
            char prefix = (char)(random.nextInt(5) + 'A');

            // Generate a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999) + 1;
            String suffix = String.format("%03d", number);

            // Combine prefix and suffix to form the OrderID
            orderIDs[i] = prefix + suffix;
        }

        // Print all generated OrderIDs
        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}



EXERCISE 2- Explanation

Random random = new Random();

    -Creates a new instance of Java’s built-in Random class to generate random numbers.

String[] orderIDs = new String[5];

    -Declares an array to hold five OrderIDs.

for (int i = 0; i < orderIDs.length; i++)

    -A standard for loop that will run five times, once for each index in the array.

char prefix = (char)(random.nextInt(5) + 'A');

    -random.nextInt(5) generates a number from 0 to 4.

    -Adding 'A' (which is 65 in ASCII) gives values between 65 and 69, corresponding to characters 'A' to 'E'.

    -(char) casts the resulting int to a character.

int number = random.nextInt(999) + 1;

    -Generates a number between 1 and 999.

    -random.nextInt(999) gives 0 to 998 → +1 shifts it to 1–999.

String suffix = String.format("%03d", number);

    -Formats the number as a three-digit string, adding leading zeros if necessary.

    -For example, 7 becomes "007", 42 becomes "042".

orderIDs[i] = prefix + suffix;

    -Combines the letter and number into a full OrderID string (e.g., B073, E999, etc.).

for (String orderID : orderIDs)

    -A for-each loop that goes through each element in the array.

System.out.println(orderID);

    -Prints each generated OrderID to the console.



EXERCISE 3 - SORT, REVERSE, and CLEAR elements in a string array

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        // Initial array of pallet IDs
        String[] pallets = {"B14", "A11", "B12", "A13"};

        // Sort the array in ascending order
        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }

        // Reverse the sorted array
        System.out.println("\nReversed ....");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList); // Reverses the order
        for (String pallet : palletList) {
            System.out.println("-- " + pallet);
        }
    }
}


EXERCISE 3 - Explanation

    Arrays.sort(pallets)
    -Sorts the array alphabetically (lexicographically).

    Collections.reverse(...)
    -Reverses the order of the sorted list.

    Arrays.asList(...)
    -Converts the array into a list so that it can be reversed using Collections.reverse.


EXERCISE 4 - CLEAR elements in a string array

import java.util.Arrays;

public class ArrayClearDemo {
    public static void main(String[] args) {
        String[] pallets = { "B14", "A11", "B12", "A13" };

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

Explanation

    Arrays.fill(pallets, 0, 2, null)
    Replaces the elements at index 0 and 1 with null.

    pallets[0].toLowerCase() is only called when the value is not null to avoid a NullPointerException.

    pallets.length is the size of the array (still 4, even after clearing 2 elements).
