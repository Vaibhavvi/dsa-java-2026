package Sortings;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int n=arr.length;
        // Traverse Outer Loop
        for(int i=0; i<n-1; i++){
            //Traverse Inner Loop
            int swapped = 0;
            for(int j=0; j<n-1-i; j++){
                //Swap if the element is grater than the next element
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped++;
                }
            }
            if(swapped==0){
                break;
            }
        }
    }

    // Method to print the Array

    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before Sorting");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After Sorting");
        printArray(arr);
    }
}
