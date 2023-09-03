public class linearsearch {

    public static void main(String[] args) {
        int array[]={1,23,45,65,90,56,-3,5,-6,-56,20};
        int target = 65;
        int ans = linearSearch(array,target);
        System.out.println("index is ::"+ans);

        int ans1 = linearSearch1(array,target);
        System.out.println("element is ::"+ans1);
        System.out.println("element is present or not if yes return true else false------"+linearSearch3(array,target));

    }
    public static int linearSearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        //if element found return the index
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        //if element or target is not found then return -1
        return -1;
    }
    public static int linearSearch1(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        //if element found return the element
      for(int element : arr){
          if(element==target){
              return element;
          }
      }
        //if element or target is not found then return -1
        return -1;
    }
    public static boolean linearSearch3(int arr[],int target){
        if(arr.length==0){
            return false;
        }
        //if element found return the true or false
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(element==target){
                return true;
            }
        }
        //if element or target is not found then return -1
        return false;
    }
}
