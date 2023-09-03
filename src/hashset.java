import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();//syntax same as arraylist

        //Insert
//--------------------------------------------------------------------------------------------------------
        //elements are not added in sorted order in hashset
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);//not stored because store only unique elements

        //contains / search
        System.out.println(set.contains(2));
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set does not contain 6");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }

        //size
        System.out.println("size of set is : "+set.size());

        //print all elements
        System.out.println(set);

        //iterator
        Iterator it = set.iterator();
        // it contains to main methods : next() and hasNext()
        //hasNext() returns true or false
        while (it.hasNext()){
            System.out.print(it.next()+"  ");
        }


    }
}
