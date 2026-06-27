package Sortings;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;

        //Make a Variable to store the minimum value 
        int minValue;
        //Loop through the array to find the minimum value and swap it with the first element 
        for(int i=0; i<n-1; i++){
            minValue = i;
            //Inner Loop to find the minimum value in the unsorted array
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minValue]){
                    minValue = j;
                }
            }
            // Swap the minimum value with the first element
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }

        public static void printArray(int[] arr){
            int n=arr.length;

            // Traverse the array through loop
            for(int i=0; i<n-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args){
        int[] arr = {46, 23, 12, 78, 34, 56};
        selectionSort(arr);
        printArray(arr);
    }
}
