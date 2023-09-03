public class ll1 {
    public static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(3);
        list.display();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(6);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertLast(99);
        list.insert(44,3);
        list.display();
        System.out.println("deleted element is : "+list.deleteFirst());
        list.display();
        System.out.println("element at last is : "+list.deleteLast());
        list.display();
        System.out.println();
        list.display();
        System.out.println("element at 2nd index is : "+list.delete(2));
        list.display();
        System.out.println(list.find(7));
        System.out.println(list.find(5));

        System.out.println("before removing duplicates : ");
        list.display();
        list.duplicates();
        System.out.println("after removing duplicates : ");
        list.display();

        System.out.println("merging two linked list ::: ");
        ll list1 = new ll();
        list1.insertFirst(32);
        list1.insertFirst(37);
        list1.insertFirst(38);
        list1.insertFirst(39);

        ll list2 = new ll();
        list2.insertFirst(45);
        list2.insertFirst(47);
        list2.insertFirst(48);
        list2.insertFirst(49);
        list2.insertFirst(50);

         ll ans1 = list.mergeTwoList(list1,list2);
         ans1.display();

         ll cycle = new ll();
         cycle.insertFirst(34);
         cycle.insertFirst(4);
         cycle.insertFirst(74);
         cycle.insertFirst(94);
         cycle.insertFirst(42);
         cycle.insertFirst(31);


    }
}
