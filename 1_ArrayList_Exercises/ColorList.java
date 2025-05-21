// Write a java program for getting different colors through ArrayList interface and extract
// the elements 1st and 2nd from the ArrayList object by using SubList()


package assignment;

import java.util.ArrayList;

public class ColorList {
	    public static void main(String[] args) {
	        // Creating an ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Green"); // index 1 (2nd element)
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original List: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            colors.remove(1);
	        }

	        // Remove "Blue" from the list
	        colors.remove("Blue");

	        // Display updated list
	        System.out.println("After removals: " + colors);
	    }
	}
