// 4. Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()

package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemover {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3

        Scanner scanner = new Scanner(System.in);

        // Display the original list
        System.out.println("Original List: " + colors);

        // Ask the user for the index to delete
        System.out.print("Enter index (0-based) to remove: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            // Remove element at the given index
            colors.remove(index);
            System.out.println("After removing element at index " + index + ": " + colors);
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close(); // Close the scanner
    }
}

