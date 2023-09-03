import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        //data is not stored in sorted order
        map.put("india",120);
        map.put("china",232);
        map.put("usa",32);

        System.out.println(map);
        map.put("china",233);

        //search
        if(map.containsKey("china")){
            System.out.println("key contains china");
        }else {
            System.out.println("key is not present in map");
        }

        System.out.println(map.get("china"));//key exists and it returns value of china
        System.out.println(map.get("indonesia"));//key doesn't exists

        //for loop :::: traversing
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+"  ");
            System.out.print(e.getValue()+" ");
            System.out.println();
        }

        //another way of traversing
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+"--"+map.get(key));
        }

    }
}
