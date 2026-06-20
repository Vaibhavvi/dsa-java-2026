public class SubArray {

    public static void printSubArrays(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        //Pick starting point
        for(int i=0; i<arr.length; i++){
            //Pick ending point
            for(int j=i+1; j<=arr.length; j++){
                int sum = 0;
                //Print subarray between current starting and ending points
                for(int k=i; k<j; k++){
                    System.out.print(arr[k]+",");
                    sum = sum + arr[k];
                   if(sum > maxSum){
                    maxSum = sum;
                   }
                }
                System.out.println("("+sum+")");
            }
            System.out.println("Maximum Sum of Subarrays: "+ maxSum);
            
        }
    }
    public static void main(String[] args){
        int[] arr = {1, -2, 3, -4, 5};
        printSubArrays(arr);
    }
}
