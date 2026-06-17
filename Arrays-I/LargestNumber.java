public class LargestNumber {
    public static int largestNumber(int nums[]){
        int Largest = nums[0];
        // Traverse the array and compare each element with the current largetst number
        for(int i=1; i<nums.length; i++){
            if(nums[i] > Largest){

                // If nums[i] is greater than the current largest number, update the larget number
                Largest = nums[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 6, 3, 9};
        System.out.println(largestNumber(nums));

        // Time Complexity : O(n) - Worst Case
        // Time Complexity : O(1) - Best Case
    }
}
