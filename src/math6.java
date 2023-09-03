import java.util.*;
class math6 {
    public static void main(String[] args) {
        int arr[] ={0,1,2,2,3,0,4,2};
        System.out.println(sum(arr,2));

    }
    static int[] twosum(int arr[],int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<arr.length; i++){
            if(map.containsKey(target-i)){
                return new int[]{map.get(target-arr[i]),i};
            }else {
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static int sum(int arr[],int val){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        System.out.println(list);
        for(int j = 0 ; j<=-list.size();j++){
            if(list.get(j)==val){
                list.remove(list.get(j));
            }
        }
        System.out.println(list);
        return list.size();
    }
}

