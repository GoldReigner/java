import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(24);
        arrayList.add(32);
        arrayList.add(90);
        System.out.println("printing the list ");
        System.out.println(arrayList);

        //get elements
        int element = arrayList.get(0);
        int element1 = arrayList.get(2);
        System.out.println("using get element");
        System.out.println(element);
        System.out.println(element1);

        //modify element in the list
        System.out.println("using add with modify");
        arrayList.add(1,100);
        System.out.println(arrayList);

        //set element in the list
        System.out.println("using set element ");
        arrayList.set(0,99);//replace the original element
        System.out.println(arrayList);

        //delete element
        System.out.println("deleting element : ");
        arrayList.remove(2);
        System.out.println(arrayList);

        //size
        System.out.println("size of list is : ");
        int size = arrayList.size();
        System.out.println(size);

        //loops
        System.out.println("printing the elements using for loop : ");
        for(int i = 0;i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //sorting
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
