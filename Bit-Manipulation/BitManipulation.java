public class BitManipulation {

    //Method to Find Number is ODD or EVEN using Bit Manipulation 
    public static void printOddEven(int n){

            //Condition of Checking ODD & EVEN
            if((n&1)==1){
                System.out.println("ODD Number");
            }else{
                System.out.println("EVEN Number");
            }
    }

    // Get ith Bit
    public static int getBit(int n , int i){

        int bitMask = 1 << i;

        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    // Set ith Bit
    public static int setBit(int n , int i){
        int bitMask = 1 << i;
        
        return n | bitMask;
    }

    // Clear ith Bit
    public static int clearBit(int n , int i){
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    // Chcek If a number is power of 2 or not
    public static boolean checkPowerofTwo(int n){
        return (n & ( n - 1 )) == 0;
    }
    public static void main(String[] args){
        printOddEven(6);

        // Call ith Bit
        System.out.println(getBit(12, 4));
        System.out.println(setBit(10, 0));
        System.out.println(clearBit(10, 1));

        System.out.println(checkPowerofTwo(10));
    }
}
