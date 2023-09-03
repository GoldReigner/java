import java.util.Arrays;

public class strings {

    public static void main(String[] args) {
        int [] arr = {2,3,45,56,65};
        int num = 10;
        String name = "ankit";
        String a = "kunal";// a is reference variable and kunal is object
//        String b = "kunal";
        System.out.println(a);
        a = "sharma";//created new object sharma
        System.out.println(a);

        System.out.println(90);//println contains toString method which converts every primitive type to toString()

        System.out.println(new int[]{23,34,546,56});
        //here println uses his toString method due to which for arrays it give hashcode type something
        //so we have to use explicitly our own method to print this i.e given below
        System.out.println(Arrays.toString(new int[]{23,34,45,56,67}));

        String aa = null;
        System.out.println(aa);

//        Integer number = new Integer(384);//wrapper class
//        System.out.println(number.toString());



    }
}
