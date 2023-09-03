import java.util.ArrayList;

public class strings2 {
    public static void main(String[] args) {
//==============================================================================================================
        float a = 453.54345f;
        System.out.printf("formatted number is %.2f",a);
        System.out.println();
        System.out.printf("Pie  : %.3f",Math.PI);

        System.out.println();
        System.out.printf("Hello my name is %s and i am %s","ankit","cool");
        System.out.println();
//==============================================================================================================

        System.out.println('a' + 'b');//adds ascci values of a and b
        //a = 97 and b = 98
        System.out.println("a"+ "b");//concatenate the two strings
        System.out.println('A'+'a');
//==============================================================================================================

        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a" +1);
//integer will be converted to Integer(wrapper class) that will call toString()

        System.out.println("kunal"+new ArrayList<>());
      //System.out.println("kunal"+  new Integer(56));
//explicitly defining Integer

        // '+' operator is only defined for the primitives and Strings concatention
        // if we try to concatenate non primitives then it will give error but if we have atleast one string in between
        //then it will work
        //System.out.println(new Integer(34)+new ArrayList<>());

       // System.out.println(new Integer(34)+" "+new ArrayList<>());
        //above will work fine

       // System.out.println(new Integer(34)+new Integer(34));
//==============================================================================================================


    }
}
