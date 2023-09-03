import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int [] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

// ------------------------------------------------------------------------------------------------------------
        //PROBLEM : TO SWAP THE INDICES OF THE ARRAY
        int [] array = {1,3,4,5,6,};
        System.out.println(Arrays.toString(array));
        System.out.println("after swapping ");
        swap(array,1,2);
        System.out.println(Arrays.toString(array));

// ------------------------------------------------------------------------------------------------------------
          //PROBLEM: TO FIND THE MAXIMUM ELEMENT IN THE ARRAY
        int [] arrays = {1,3,43,9,99};
        System.out.println("maximum element in the array is ::::  "+max(arrays));

//----------------------------------------------------------------------------------------------------------------
         //PROBLEM : TO FIND THE MAXIMUM ELEMENT IN THE GIVEN RANGE IN THE ARRAY
        int [] rangeArr = {1,2,4,34,45,56,76,70};
        System.out.println("range------------------------------");
        System.out.println(Range(rangeArr,2,5));

//----------------------------------------------------------------------------------------------------------------
        //PROBLEM : TO REVERSE THE ARRAY
        int revArr[] = { 1,2,3,4,5,6,7};
        System.out.println("before reversing");
        System.out.println(Arrays.toString(revArr));
        reverseArrays(revArr);
        System.out.println("after reversing");
        System.out.println(Arrays.toString(revArr));
    }

//=========================================================================================================
    static void reverseArrays(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
           swap(arr,start,end);
           start++;
           end--;
        }
    }

static int Range(int arr[],int start,int end){
        if(start>end){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max = arr[start];
        for(int i = start;i<end;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
}

    static int max(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int arr[],int index1,int index2){
        int temp;
        temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }

    static void change(int arr[]){
        arr[0]  = 99;//it will change the original array
        //arrays are mutable in java
        //mutable - user can change the object
    }
}
