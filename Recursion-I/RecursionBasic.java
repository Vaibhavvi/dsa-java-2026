public class RecursionBasic {

    // Que -- 1. Print number from n to 1 using recursion
    public static void printDec(int n) {
        // Base case 
        if(n == 1){
            System.out.println(n);
            return;
        }
        // Recursive case
        System.out.print(n + " ");
        // Function call
        printDec(n - 1);
    }

    // Que -- 2. Print number from 1 to n using recursion
    public static void printInc( int n) {
        // Base case
        if(n == 1){
            System.out.print( n + " ");
            return;
        }
        //Recursive case
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // Que -- 3. Print Factorial of a number using recursion
    public static int factorial(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        // Recursive case
        int fact = n * factorial(n - 1);
        return fact;
    }

    // Que -- 4. Print Sum of first n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n){
        // Base case
        if(n == 0){
            return 0;
        }

        // Recursive case
        int sum  = n + sumOfNaturalNumbers(n - 1);
        return sum;
    }

    // Que -- 5. Print Fibonacci series and their sum using recursion
    public static int sumOfFibonacci(int n){
        // Base case
        if( n == 0 || n == 1){
            return n;
        }
        //Recursive case
        int fib1 = sumOfFibonacci(n-1);
        int fib2 = sumOfFibonacci(n-2);
        return fib1 + fib2;
    }

    // Que -- 6. Print first Occurrence of a number in an array using recursion
    public static int firstOccurrence(int[] arr, int i, int key){
        //Base Case 
        if( i == arr.length - 1 ){
            return -1;
        }
        // Recusrive case
        if(arr[i] == key){
            return i;
        }
        return firstOccurrence(arr, i+1, key);
    }


    // Que -- 7. Print Last Occurrence of an array using recursion
    public static int lastOccurrence(int[] arr, int i, int key){
        // Base Case 
        if(i == arr.length){
            return -1;
        }

        // Recursve case
        int isFound = lastOccurrence(arr, i+1, key);

        if(arr[i] == key && isFound == -1){
            return i;
        }
        return isFound;
    }

    // Que -- 8. Print x to the power n
    public static int power(int x , int n){
        // Base Case
        if(n == 0){
            return 1;
        }

        return x * power( x , n - 1 );
    }
    public static void main(String[] args) {
        // Value of n
        int n = 5;

        // Calling the function 01
        printDec(n);

        // Calling the function 02
        printInc(n);
        System.out.println();

        // Calling the function 03
        System.out.println(factorial(n));

        // Calling the function 04
        System.out.println(sumOfNaturalNumbers(n));

        // Calling the function 05
        for(int i = 0; i < n; i++){
            System.out.print(sumOfFibonacci(i) + " " );
        }
        System.out.println();

        // Print the sum of first n fibonacci numbers
        System.out.println("Sum of first " + n + " fibonacci numbers is : " + sumOfFibonacci(n));


        // Calling the function 06 
        int[] arr = {1, 2, 3, 5, 6 ,1};
        int key = 1;
        int lastOccur = lastOccurrence(arr, 0, key);
        if(lastOccur == -1){
            System.out.println("Element not found in the array");
        }else {
            System.out.println("Last Occurrence of " + key + " is at index : "+ lastOccur);
        }

        // Call the function 08
        System.out.println(power(2,4));
    }
}