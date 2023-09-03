import java.util.*;
public class hashmap3problem {
//--------------------------------------------------------------------------------------------------------------
    //PROBLEM: UNION OF 2 ARRAYS
//=================================================================================================================
    public static int union(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for(int j = 0 ; j < arr2.length ; j++){
            set.add(arr2[j]);
        }
//        for(int k : arr2){                   //mine logic
//            if(!set.contains(k)){
//                set.add(k);
//            }
//        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
    }
}
