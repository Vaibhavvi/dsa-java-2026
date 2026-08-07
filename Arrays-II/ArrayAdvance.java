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
    public static void main(String[] args){
        int arr[] = { 4,2,0,6,3,2,5 };
        System.out.println("Trapped Rain Water:" + trappedRainWater(arr));
    }
}