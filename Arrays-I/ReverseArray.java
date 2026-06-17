public class ReverseArray {

    public static void reverseArray(int[] arr){
        // Using two pointer approch to reverse the array
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            // Swap the elements at start and end 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the start and end pointers towards the center 
            start++;
            end--;
        }
    }
    public static void main(String[] args){

        // Example usage
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // After reversing the array
        reverseArray(arr);
        System.out.println("Reversed Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
