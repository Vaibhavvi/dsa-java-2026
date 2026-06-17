public class PairsArray {

    public static void printPairs(int[] arr){
        // Track the outer loop for current element
        for(int i=0; i<arr.length; i++){
            // make a variable to store the current element 
            int current = arr[i];
            // Track the inner loop for next element
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+current +","+ arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printPairs(arr);
    }
}
