// 1.Write a java program for getting different colors through ArrayList interface and search whether
// the color "Red" is available or not

package assignment;

import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {
        // Creating an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Adding elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying all colors
        System.out.println("Colors: " + colors);

        // Searching for "Red" in the list
        if (colors.contains("Red")) {
            System.out.println("Color 'Red' is available.");
        } else {
            System.out.println("Color 'Red' is not available.");
        }
    }
}
