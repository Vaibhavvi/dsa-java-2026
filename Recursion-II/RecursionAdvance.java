public class RecursionAdvance{

    // Que -- 01. Tilling Problem
    public static int tillinProblem(int n){
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }

        // Recursive case 
        return tillinProblem(n - 1) + tillinProblem(n - 2);
    }

    // Que -- 02. Friends Pairing
    public static int pairinnFriends(int n){
        // Base Case
        if( n == 1 || n == 2){
            return n;
        }

        // Recursive case 
        return pairinnFriends(n - 1) + (n - 1) * pairinnFriends(n - 2);
    }

    // Que -- 03.For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem.
    public static void findAllOccurrences(int[] arr, int i, int count, int key){
        // Base case
        if( i == arr.length){
            return;
        }

        // Recursive call 
        if(arr[i] == key){
            System.out.print( i + " ");
            count++;
            
        }

        findAllOccurrences(arr, i+1, count, key);
    }
    public static void main(String[] args){

        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

       findAllOccurrences(arr, 0, 0, key);

    }
}