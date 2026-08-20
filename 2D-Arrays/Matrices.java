import java.util.Scanner;

public class Matrices {
    // Method to find element index
    public static void keySearch(int arr[][], int key) {
        int row = arr.length;
        int col = arr[0].length;

        // Traverse Arrays
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Element found at index :(" + i + " , " + j + ")");
                }
            }
        }
    }

    // Method to find minValue in 2D Arrays
    public static void minValueFind(int arr[][]) {
        // Array length find
        int row = arr.length;
        int col = arr[0].length;

        // Store minValue
        int minValue = arr[0][0];

        // Traverse the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Chcek if minValue > arr[i][j]
                if (minValue > arr[i][j]) {
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value of Array:" + minValue);
    }

    // Method to print Spiral Maxtrix
    public static void printSpiral(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Top (Left to Right)
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Right to Left
            for (int j = right; j >= left; j--) {
                System.out.print(matrix[bottom][j] + " ");
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }

    // Method to print Sum of Diagonal
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;

        // Traverse the Loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * //Create a 2D Array
         * int arr[][] = new int[3][3];
         * 
         * int row = arr.length;
         * int col = arr[0].length;
         * 
         * //Taking input of Matrices
         * Scanner sc = new Scanner(System.in);
         * 
         * //Taking input and print 2D Array
         * for(int i=0; i<row; i++){
         * for(int j=0; j<col; j++){
         * arr[i][j] = sc.nextInt();
         * }
         * }
         * 
         * // Output
         * for(int i=0; i<row; i++){
         * for(int j=0; j<col; j++){
         * System.out.print(arr[i][j]+" ");
         * }
         * System.out.println();
         * }
         * 
         * // Method call keySearch
         * keySearch(arr, 8);
         * 
         * // Method call minValueFind
         * minValueFind(arr);
         */

        int[][] matrix = { { 1, 2, 3 },
                           { 4, 5, 6 },  
                           { 7, 8, 9 }
                        };
            System.out.println(diagonalSum(matrix));
    }
}