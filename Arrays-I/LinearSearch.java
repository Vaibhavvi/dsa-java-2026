// Time Complexity : O(n) - In worst case, we have to traverse the entire array to find the key or determine that it is not present.
// Time Complxity : O(1) - In best case, the key is found at the fist position in array so that it is constant time complexity.
public class LinearSearch {

    public static int linearSearch(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1; // Outside the loop
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;

        int index = linearSearch(numbers, key);

        if (index != -1){
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array");
        }
    }
}