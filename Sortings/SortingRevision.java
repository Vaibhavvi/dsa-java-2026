package Sortings;

public class SortingRevision {
    // Method to perform Bubble Sort
    public static void bubbleSort(int arr[]) {
        // Traverse the array
        for (int i = 0; i < arr.length - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // If current element is greater than next element
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    // Method to write Selection Sort Algo
public static void selectionSort(int arr[]){
    //Traverse the outer Loop
    for(int i=0; i<arr.length-1; i++){
        int minPos = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
                minPos = j; 
            }
        }
        //Swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}

//Method to Write Insertion Sort Algo
public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        //finding out the correct position to insert
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //Insert
        arr[prev+1] = curr;
    }
}

    public static void main(String[] args) {
        int arr[] = { 2, 6, 4, 8, 3, 5 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
