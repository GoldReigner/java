import java.util.Locale;

public class stringsproblem {
    public static void main(String[] args) {
        String str = "lool";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i = 0 ; i <= str.length()/2 ; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }

}
//        char start = str.charAt(0);
//        char end =   str.charAt(str.length()-1);
//        while(end>start){
//            if(start!=end){
//                return false;
//            }
//            start++;
//            end--;
//        }