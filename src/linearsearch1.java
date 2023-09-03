import java.util.Arrays;

public class linearsearch1 {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        //PROBLEM : SEARCH FOR 3 IN THE RANGE OF INDEX[1,4]
        int[] arr = {19,13,34,-12,-34,456,56,3,45,516,76};
        int target = 3;
        System.out.println("index of target is::::::::::-------------"+linearSearch(arr,target,2,7));

        //PROBLEM : TO FIND MINIMUM ELEMENT IN THE ARRAY
        System.out.println("minimum element in the array is :::-----"+min(arr));

        //PROBLEM : TO FIND THE TARGET ELEMENT IN THE 2D ARRAY
        int array[][]={
                {1,23,45,45,},
                {34,45,67,87},
                {9,6,78,98,8}
        };
        int target1 = 78;
        int ans[] = min2D(array,target1);
        System.out.println("index of  element in the 2d array is ::"+ Arrays.toString(ans));

        System.out.println(max(array));
    }




//=========================================================================================================
    public static int[] min2D(int arr[][],int target){
        for (int i = 0; i <arr.length;i++){
            for(int j = 0; j <arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //=========================================================================================================
    public static int max(int arr[][]){
        int max = Integer.MIN_VALUE;
        for (int[] i : arr){
            for(int j : i){
                if(j > max){
                    max = j ;
                }
            }
        }
        return max;
    }
//=========================================================================================================
    public static int min(int arr[]){
        int low = Integer.MAX_VALUE;
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i] < low){
                low = arr[i];
            }
        }
        return low;
    }
    public static int linearSearch(int arr[],int target,int start ,int end){
        if(arr.length==0){
            return -1;
        }
        //if element found return the index
        for(int i = start ; i <= end ; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        //if element or target is not found then return -1
        return -1;
    }
}
