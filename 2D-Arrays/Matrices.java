import java.util.Scanner;

public class Matrices{
    //Method to find element index
    public static void keySearch(int arr[][], int key){
        int row = arr.length;
        int col = arr[0].length;

        //Traverse Arrays
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(key == arr[i][j]){
                    System.out.println("Element found at index :("+ i +" , "+ j +")");
                }
            }
        }
    }

    // Method to find minValue in 2D Arrays
    public static void minValueFind(int arr[][]){
        // Array length find
        int row = arr.length;
        int col = arr[0].length;

        // Store minValue
        int minValue = arr[0][0];

        //Traverse the array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                // Chcek if minValue > arr[i][j]
                if(minValue > arr[i][j]){
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value of Array:" + minValue);
    }
    public static void main(String[] args){
        //Create a 2D Array
        int arr[][] = new int[3][3];

        int row = arr.length;
        int col = arr[0].length;

        //Taking input of Matrices
        Scanner sc = new Scanner(System.in);

        //Taking input and print 2D Array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Method call keySearch
        keySearch(arr, 8);

        // Method call minValueFind
        minValueFind(arr);
    }
}