import java.util.Arrays;
import java.util.Scanner;
//problems in array1.java
public class array {

    public static void main(String[] args) {
        //datatype[] variable_name = new datatype[size];
//        int [] rno = new int[2];
//         rno[0] = 33333;
//         rno[1] = 33333;
//         rno[2] = 33333;
//         rno[3] = 33333;
//         rno[4] = 33333;
//        int [] ros ;//declaration of array, ros is getting defined in the stack
//        ros = new int[5];//actually here object is being created in the memory(heap)
//         int arr[] = new int[3];
    Scanner sc = new Scanner(System.in);
//--------------------------------------------------------------------------------------------------------------------
//        System.out.println("type int elements");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//=======================================================================================================

//        System.out.println(Arrays.toString(arr));
        //import java.util.Arrays;
        //it will print the array
//=========================================================================================================
        //to print array of OBJECTS
//        System.out.println("type string elements");
//        String str[] = new String[3];
//        for(int i = 0 ; i < str.length;i++){
//            str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));
//---------------------------------------------------------------------------------------------------------------
//        for(int i = 0 ; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
  //---------------------------------------------------------------------------------------------------------------------
        //enhanced for loop and for each loop
//        System.out.println("enhanced for loop OR for each loop ::::::");
//        for(int num : arr){//here num represents the element of the array
//            System.out.print(num+" ");
//        }
       // System.out.println(arr[3]);//index out of bound exception
//---------------------------------------------------------------------------------------------------------------------
          //multidimensional array
        int[][] array = new int[3][3];//rows are mandatory but columns are not mandatory
        int arr1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("enter the elements");
        int l[][] = new int [3][3];//cols are not mandatory
        for(int row = 0; row < l.length; row++){//l.length will give the length of the row
            for (int col = 0; col  < l[row].length; col++){//l[i].length is the arr[row].length
                 l[row][col] = sc.nextInt();
            }
        }
//---------------------------------------------------------------------------------------------------------------------

//         for(int row = 0; row < l.length; row++){//l.length will give the length of the row
//            for (int col = 0; col  < l[row].length; col++){//l[i].length is the arr[row].length
//                System.out.print("arr["+row+"]"+"["+col+"]"+"="+l[row][col]+"   ");
//            }
//            System.out.println();
//        }
//---------------------------------------------------------------------------------------------------------------------

//        for(int row = 0; row< l.length; row++ ){
//            System.out.println(Arrays.toString(l[row]));
//        }
//---------------------------------------------------------------------------------------------------------------------

        for(int[] a : l){
            System.out.println(Arrays.toString(a));
        }

    }
}
