package ArrayList;
import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add operations in ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30); // ArrayList after adding elements: [10, 20, 30]
        System.out.println("ArrayList after adding elements: "+ numbers);

      // Remove operations in ArrayList
      numbers.remove(1); // Removes the element at index 1(20); [10, 30]
      System.out.println("ArrayList after removing element: "+numbers);


      // Get operations in ArrayList
      int number = numbers.get(1); // Gets the element at index 1(30)
      System.out.println("Element at index 1: "+ number);


      // Size operations in ArrayList
      int size = numbers.size(); // Gets the size of the ArrayList(2)
      System.out.println("Size of ArrayList: "+size);


      // Set operations in ArrayList
      int oldValue = numbers.set(0, 100); // Sets the element at index 0 to 100;
      System.out.println("Old value at index 0: "+oldValue); // Prints the old value at index 0(10)
      System.out.println("ArrayList after setting new value: "+numbers); // Prints the ArrayList after setting new value: [100, 30] 


      // Contains operations in ArrayList
      boolean containsValue = numbers.contains(100); // CHecks if the ArrayList contains the value 100
      System.out.println("Contains value 100: "+containsValue); // Prints true


      // Clear operations in ArrayList
      numbers.clear(); // Clears all elements from the ArrayList
      System.out.println("ArrayList after clearing all elements: " + numbers); // [] null value printed


    }
}
