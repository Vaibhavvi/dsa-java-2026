import java.util.Scanner;

public class ArrayCC{
    public static void main(String[] args){
        // Input taken in array and find the average of marks 

        // Array intialization
        int[] arrMarks = new int[100];

        //Taking input in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 students :");

        // Storing the marks thorugh user input in array
        arrMarks[0] = sc.nextInt();
        arrMarks[1] = sc.nextInt();
        arrMarks[2] = sc.nextInt();
        sc.close();

        
        // Finding the avrage of marks 
        System.out.println("Avrage of marks is :" + (arrMarks[0] + arrMarks[1] + arrMarks[2]) / 3);

        
    }
}