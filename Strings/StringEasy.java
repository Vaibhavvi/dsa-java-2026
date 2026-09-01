// Easy Level Question of String

public class StringEasy {
    //Method to Palindrom a String
    public static boolean isPalindrom(String str){
        int n = str.length();
        //Traverse the half string
        for(int i=0; i<str.length()/2; i++){
            //Chcek condition of Palindrom 
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "racecar";
        System.out.println(isPalindrom(str));
    }
}
