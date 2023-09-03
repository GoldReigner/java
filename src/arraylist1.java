import java.util.ArrayList;
import java.util.Scanner;

//------------------------------------------------------------------------------------------------------------
//multidimensional arrays
public class arraylist1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for(int i = 0 ; i<3;i++){
            list.add(new ArrayList<>());
        }// we need to create the objects of reference otherwise without initialisation it will give error

        //add elements
        for(int i = 0 ; i< 3;i++){
            for(int j =0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
