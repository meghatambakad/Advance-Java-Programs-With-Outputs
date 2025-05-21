// 3. Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)

package assignment;


import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding unsorted colors
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before Sorting: " + colors);

        // Sorting the ArrayList alphabetically
        Collections.sort(colors);

        // Display sorted list
        System.out.println("After Sorting: " + colors);
    }
}


