public class ArrayAdvance{

    // Problem 01 -- Trapped Rain Water Problem
    public static int trappedRainWater(int arr[]){
        int n = arr.length;

        // Calculate left max boundary array
        int LeftMax[] = new int[n];
        LeftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            LeftMax[i] = Math.max(arr[i], LeftMax[i-1]);
        }

        // Calculate right max boundary array
        int RightMax[] = new int[n];
        RightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            RightMax[i] = Math.max(arr[i], RightMax[i+1]);
        }

        int trappedWater = 0;

        // Calculate the trapped water
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(LeftMax[i], RightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }

    // Problem 02 -- Twice of a Number in an Array
    public static boolean checkTwice(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if( arr[i] == 2*arr[j] || arr[j] == 2*arr[i]){
                    return true;
                }
            }
        }
        return false;
    }

    // Probelm 03 --- Contain Duplicate with Brute Force 
    public static boolean checkDuplicate(int arr[]){
        //Traverse the array and check for duplicates
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5};
        System.out.println(checkDuplicate(arr));

    }
}