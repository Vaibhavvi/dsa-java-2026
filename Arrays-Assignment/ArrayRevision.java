public class ArrayRevision {

    //Method to perform Linear Search
    public static boolean LinearSearch(String menu[], String key){
        //Iterate through the array
        for(int i=0; i<menu.length; i++){
            //Check if the condition is true
            if(menu[i]==key){
                return true;
            }
        }
        return false;
    }

    // Method to find the Largest number in an array
    public static int LargestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Method to find Binary Search in an array
    public static boolean BinarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return true;
            }

            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    
    // Method to Reverse an array
    public static void ReverseArray(int numbers[]){
        int start = 0;
        int end = numbers.length-1;

        //Iterate through the array
        while(start<end){
            //Swap the number for reverse the array
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    //Method to pairs in an array
    public static void PairsInArray(int numbers[]){
        //Iterate through the array
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        // Method to perform Linear Search execution code

        // String menu[] = {"Banana", "Apple", "Mango", "Grapes", "Orange"};
        // String key = "Coconut";
        // boolean result = LinearSearch(menu, key);
        // if(result){
        //     System.out.println("Iteam is found in the menu");
        // }else{
        //     System.out.println("Iteam is not found in the menu");
        // }



        // Method to find the largest number in an array execution code

        //  int numbers[] = {1,4,5,6,3,2,5,8};
        //  int largest = LargestNumber(numbers);
        //  System.out.println("Largest number is: "+largest);



        // Method to Binary Search an array execution code

        // int numbers[] = {2,4,6,8,10,12,14};
        // int key = 10;
        // boolean result = BinarySearch(numbers,key);
        // if(result){
        //     System.out.println("Numbers is found in the array");
        // }else{
        //     System.out.println("Numbers is not found in the array");
        // }



        // Method to Reverse an array execution code

        // int numbers[] = {1,2,3,4,5};
        // System.out.print("Before Reverse the array: ");
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();
        // ReverseArray(numbers);
        // System.out.print("After Reverse the array: ");
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();


        //Method to find pairs in an array execution code
        int numbers[] = {1,2,3,4,5};
        PairsInArray(numbers);
    }
}
