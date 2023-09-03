import java.util.*;
public class hashmap2problem {
//--------------------------------------------------------------------------------------------------------------
    //PROBLEM: MAJORITY ELEMENT - GIVEN AN INTEGER OF SIZE N , FIND ALL ELEMENTS THAT APPEAR MORE THAN N/3 TIMES
//=================================================================================================================
    public static void majorityElement(int nums[]){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1 );
            }else {
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3 ){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1 , 3 , 2 , 5 , 1 , 3 , 1 , 5 , 1}; // 1
        int nums1[] = {1,2};
        majorityElement(nums);
        System.out.println("for nums1 array is : ");
        majorityElement(nums1);
    }
}
