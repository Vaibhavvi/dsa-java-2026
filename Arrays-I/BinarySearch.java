public class BinarySearch{

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = start + (end - start) / 2;
            // 1st Condition if the mid element is the target
            if(arr[mid] == target){
                return mid;
            }
            // 2nd Condition if the mid is greater than the target then we go to the left side of the array and update end to mid - 1 
            else if(arr[mid] > target){
                end = mid - 1;
            }
            // 3rd Condition if the mid is less than the target then we go to the right side of the array and update start to mid + 1
            else{
                start = mid + 1;
            }
        }
        return -1; // Element not found
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: "+ result);
        }

    }
}