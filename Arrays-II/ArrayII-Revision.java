class ArrayIIRevision {

    // Method to print all subarrays of a given array
    public static void printSubArray(int[] arr) {
        // Iterate starting index
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            // Iterate ending index
            for (int j = i; j < arr.length; j++) {
                int end = j;

                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Method to find the maximum subarray sum using BRUTE FORCE approch
    public static void maxSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for(int start = 0; start<arr.length; start++){

            int currentSum = 0;

            for(int end = start; end<arr.length; end++){
                currentSum = currentSum + arr[end];

                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max SubArray of the given array is: "+ maxSum);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        maxSubArraySum(arr);
    }
}