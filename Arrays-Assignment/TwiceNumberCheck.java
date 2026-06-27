public class TwiceNumberCheck {

    public static boolean checkIfExist(int[] arr){
        // Traverse the Outer Loop
        for(int i=0; i<arr.length-1; i++){
            // Traverse the Inner Loop
            for(int j=i+1; j<arr.length; j++){
                // Check same value are available or not
                if(arr[i] == arr[j]){
                    return true; // Return true if same value found
                }
            }
        }
        return false; // Retrun false if such pairs found
    }
    public static void main(String[] args){
        int[] arr = {10, 2, 5, 3,10,10};
        boolean result = checkIfExist(arr);
        System.out.println(result); // Output: true
    }
}
