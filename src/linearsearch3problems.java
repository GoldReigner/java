import java.util.Scanner;

public class linearsearch3problems {
    public static void main(String[] args) {
//================================================================================================================
        //PROBLEM : LEETCODE 1675   RICHEST CUSTOMER WEALTH
//-----------------------------------------------------------------------------------------------------------
        int arr[][] ={ {1,2,3} , {3,2,9} };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts){
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for(int person = 0 ; person < accounts.length ; person++){
            // when you start a new col , take a new sum for that row
            int sum = 0;
            for(int account = 0 ; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
