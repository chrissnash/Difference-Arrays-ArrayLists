import java.util.*;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // Array example
        int[] numbers = new int[5];
        numbers[0] = 6;
        numbers[1] = 9;
        numbers[2] = 16;

        // Accessing element using index
        System.out.println("Number at index 1: " + numbers[1]); // Output 9

        // Iterating over array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println();
        // ArrayList example
        ArrayList<String> names = new ArrayList<>();
        names.add("Chris");
        names.add("Bella");
        names.add("Paulie");

        // Accessing element using index
        System.out.println("Second element: " + names.get(1)); // Output: Bella

        // Adding another element - resizes automatically
        names.add("Charlie");
        names.add("Joe");

        // Removing an element by index
        names.remove(1); // Removes "Bella"

        // Iterating over ArrayList using iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }

        System.out.println();
        // Prints size of Array and ArrayList
        System.out.println("Array size: " + numbers.length); // Fixed size
        System.out.println("ArrayList size: " + names.size()); // Dynamic size
    }
}