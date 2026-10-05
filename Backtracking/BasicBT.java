public class BasicBT {

    // Que - 01 -- Find the Subset 
    public static void findSubset(String str , String ans , int i){
        // Base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // Yes choice 
        findSubset(str, ans+str.charAt(i), i+1);

        // No choice 
        findSubset(str, ans, i+1);

    }

    // Que - 02 -- Find the Permutation
    public static void findPermutation(String str , String ans){
        // Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }    

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    }

    public static void main(String[] agrs){
        String str = "abc";
        findSubset(str, " ", 0);
        findPermutation(str, " ");
    }
}
