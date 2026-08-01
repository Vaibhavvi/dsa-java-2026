package Sortings;

public class Assignment {

    // Method to sort an array in Descending Order using Bubble Sort
    public static void BubbleDescendingOrder(int[] arr) {
        // Outer Loop
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner Loop
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Descending Order
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        BubbleDescendingOrder(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}