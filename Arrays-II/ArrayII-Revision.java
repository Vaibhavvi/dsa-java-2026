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

    //Method to find pre-fix sum of an array
    public static void prefixSum(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];
        prefix[0] = numbers[0];

        //Calculate prefix sum
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int start = 0; start<numbers.length; start++){
            int currentSum = 0;
            for(int end = start; end<numbers.length; end++){
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max SubArray of the given array is: "+ maxSum);
    }

    //Method to find the maximum subarray sum using KADANE'S Algorithm
    public static void kadane(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<numbers.length; i++){
            currentSum = currentSum + numbers[i];
            if(currentSum < 0){
                currentSum = 0;
            }

            maxSum = Math.max(currentSum , maxSum);
        }
        System.out.println("Max sum of the given array is : " + maxSum);
    }
    public static void main(String[] args) {
        int[] numbers = { 1, -2,-3,4,-5};
        prefixSum(numbers);
        kadane(numbers);
    }
}