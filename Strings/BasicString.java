package Strings;

// Basic Concept of String 


public class BasicString {
    //Method to String traversal
    public static void printString(String str){
        //Traverse the string 
        for(int i=0; i<str.length()-1; i++){
            // Used to print String
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    // Method to Reverse a string 
    public static void printReverse(String str){
        //Traverse the String 
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String str = "Vaibhav Dubey";
        printString(str);
        printReverse(str);

        // For Upper and Lower Case
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
