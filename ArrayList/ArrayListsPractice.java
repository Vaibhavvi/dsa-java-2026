package ArrayList;
import java.util.ArrayList;

public class ArrayListsPractice {
    // Que - 01 Reverse the ArrayList
    public static void reverseArrayList(ArrayList<Integer> numbers){
        // Using traversal method
        for( int i = numbers.size() - 1; i >= 0; i--){
            System.out.print(numbers.get(i) + " ");
        }
    }

    // Que - 02 Find the maximum element in the ArrayList
    public static int findMax(ArrayList<Integer> numbers){
        //Initilize max infinity
        int max = Integer.MIN_VALUE;

        // traversing then ArrayList
        for(int i = 0; i < numbers.size(); i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    // Que - 03 - Swap two elements in the ArrayList
    public static void swapElements(ArrayList<Integer> numbers, int idx1, int idx2){
        // Swapping the elements
        int temp = numbers.get(idx1);
        numbers.set(idx1 , numbers.get(idx2));
        numbers.set(idx2, temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Calling the reverseArrayList method
        System.out.println("The reverse of the ArrayList is: ");
        reverseArrayList(numbers);
        System.out.println(); // For new line after reverse output

        // Calling the findMax method
        System.out.println("The maximum element in the ArrayList is: " + findMax(numbers));
        
        // Calling the swapElements method
        swapElements(numbers, 0, 2);
        System.out.println("ArrayList after swapping elements at index 0 and 2: " + numbers);
    }
}
