//4.  Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()

package assignment;

import java.util.ArrayList;
import java.util.List;

public class ColorExtractor {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");    // index 0
        colors.add("Green");  // index 1
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        // Extracting sublist from index 0 to 2 (1st and 2nd elements)
        List<String> subColors = colors.subList(0, 2);

        // Displaying the sublist
        System.out.println("Extracted Sublist (1st and 2nd): " + subColors);
    }
}
