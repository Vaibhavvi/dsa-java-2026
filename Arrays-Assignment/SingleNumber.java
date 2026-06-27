public class SingleNumber {

    public static int SingleNum(int[] arr){
        //Store the result in variable
        int result = 0;

        //Traverse Loop through for each loop
        for(int num:arr){
            //Return single number and which number are present in >=2 value are 0
            result = result^num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 4};
        System.out.print(SingleNum(arr));
    }
}
