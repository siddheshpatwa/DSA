import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Printing the ArrayList
        System.out.println("Fruits: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sorting the ArrayList
        Collections.sort(fruits);
        System.out.println("After sorting: " + fruits);
    }
}
