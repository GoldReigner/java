import java.util.Arrays;

public class linearsearchinstrings {
    public static void main(String[] args) {
        String name = "Ankit Sharma";
        char target = 'a';
        System.out.println("character is present  ::---"+search(name,target));

        System.out.println("character is present or not :::::::;"+search1(name,target));

        System.out.println("string is converted to character array as -----"+ Arrays.toString(name.toCharArray()));
    }
    static boolean search1(String str,char target){

        if(str.length()==0){
            System.out.println("string is empty");
            return false;
        }
//---------------------------------------------------------------------------------------------------------------
        for(char ch : str.toCharArray()){
          //  if(ch==str.charAt(ch)){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
 //=====================================================================================================================
    static boolean search(String str,char target){
//==================================================================================================================
//                HERE str.length() ==== length() is a method
        //previously in arrays length is a variable
        if(str.length()==0){
            System.out.println("string is empty");
            return false;
        }
        for(int i = 0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
