import java.util.Arrays;
import java.util.Locale;

public class strings3 {
    public static void main(String[] args) {
        String name = "Kunal ankit sharma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        String name1 = "      ankit      ";

        System.out.println(name1.strip());//removes the extra spaces from the ends
        System.out.println(name1.trim());

        String name2 = "My name is Ankit Sharma and YOur name is ";
        System.out.println(Arrays.toString(name2.split(" ")));//so it will separate the words where we have
        //provided the space
//        System.out.println(Arrays.toString(name2.split(" ")));


    }
}
