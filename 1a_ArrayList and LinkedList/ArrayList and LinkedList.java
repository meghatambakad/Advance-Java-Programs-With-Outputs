//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
//and a LinkedList to perform the following operations with different functions directed as
//follows

package assignment;

import java.util.*;

public class ListInterfaceDemo {

    public static void main(String[] args) {
        // Create ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Operations ===");
        performAllOperations(arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        performAllOperations(linkedList);
    }

    // Method to perform all operations
    public static void performAllOperations(List<String> list) {
        addElements(list);
        addElementAtIndex(list, "Grapes", 1);
        addMultipleElements(list, Arrays.asList("Mango", "Papaya"));
        accessElement(list, 2);
        updateElement(list, 0, "Pineapple");
        removeElement(list, "Banana");
        searchElement(list, "Orange");
        getListSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        getSubList(list, 1, 3);
        clearList(list);
    }

    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Added elements: " + list);
    }

    // 2. Add element at specific index
    public static void addElementAtIndex(List<String> list, String element, int index) {
        list.add(index, element);
        System.out.println("After adding '" + element + "' at index " + index + ": " + list);
    }

    // 3. Add multiple elements
    public static void addMultipleElements(List<String> list, List<String> elements) {
        list.addAll(elements);
        System.out.println("After adding multiple elements: " + list);
    }

    // 4. Accessing element
    public static void accessElement(List<String> list, int index) {
        if (index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        }
    }

    // 5. Updating element
    public static void updateElement(List<String> list, int index, String newValue) {
        if (index < list.size()) {
            list.set(index, newValue);
            System.out.println("After updating index " + index + " to '" + newValue + "': " + list);
        }
    }

    // 6. Removing element
    public static void removeElement(List<String> list, String element) {
        list.remove(element);
        System.out.println("After removing '" + element + "': " + list);
    }

    // 7. Searching element
    public static void searchElement(List<String> list, String element) {
        boolean found = list.contains(element);
        System.out.println("Is '" + element + "' in the list? " + found);
    }

    // 8. List size
    public static void getListSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // 9. Iterating using for-each
    public static void iterateList(List<String> list) {
        System.out.print("Iterating using for-each: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 10. Using Iterator
    public static void useIterator(List<String> list) {
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    // 12. Sublist
    public static void getSubList(List<String> list, int start, int end) {
        if (start < list.size() && end <= list.size() && start < end) {
            List<String> subList = list.subList(start, end);
            System.out.println("Sublist from index " + start + " to " + (end - 1) + ": " + subList);
        }
    }

    // 13. Clear list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("List cleared. Current contents: " + list);
    }
}

