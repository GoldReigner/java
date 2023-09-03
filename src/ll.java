import java.awt.*;
import java.util.Scanner;

public class ll {

    private Node head = null;
    private Node tail = null;
    private int size;
    public ll(){
        this.size=size;
    }
//==================================================================================PROBLEM 1
    //1. inserting ll using recursion
//    public void insertRecursively(Node node,int val){
//        Node node1 = new Node();
//        Node last = node;
//        node1.value = val;
//        if(head == null && index ==0){
//            head = node1;
//            return;
//        }
//        if(index == 0){
//            index --;
//            insertRecursively(node.next,34);
//        }
//    }

    //========================================================================================PROBLEM2
    //2. duplicates in linked list
    public void duplicates(){
        Node node = head;
        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size --;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //========================================================================================PROBLEM 3
    //3.merge two linked list in a sorted order
    public ll mergeTwoList(ll f ,ll s){// as it is going to accept two lists of type ll so node1,node2 datatype is of list
        // list 1 and list2 are already sorted during merging they also remain sorted
        Node first = f.head;
        Node second = s.head;

        ll ans = new ll();

        while(first !=null && second !=null){
            if(first.value > second.value){
                ans.insertLast(first.value);
                first = first.next;
            }else{
                ans.insertLast(second.value);
                second = second.next;
            }
        }
        while (first!=null){
            ans.insertLast(first.value);
            first = first.next;
        }
        while (second!=null){
            ans.insertLast(second.value);
            second = second.next;
        }
        return ans;
    }

    //====================================================================================PROBLEM 4
    //4. to detect the cycle in a linked list      //141 ON LEETCODE
    public boolean isCycle(){
        // here we will use the FAST AND SLOW POINTER METHOD AND IT IS USED FOR MANY THINGS

        // ALSO KNOWN AS FLOYDS CYCLE FINDING ALGORITHM
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next !=null){
            fast = fast.next;
         //   fast = fast.next.next;
            if(fast.next!= null){
                fast = fast.next;
            }
            slow = slow.next;
        }
        if(fast == slow)
            return true;
        return false;
    }

    //============================================================================PROBLEM 5
    //5. is happy or not
    // check happy no on leetcode
    public boolean isHappy(int n){
        int  fast = n;
        int  slow = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while (slow != fast);
        if(slow == fast)
            return false;
        return true;
    }
    public int square(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number = number/10;
        }
        return  ans;
    }

    //===========================================================================ENDING
    public void insertFirst(int val){     //inserting node at beginning
       // Node node = new Node(val);
        Node node = new Node();
        node.value= val;
        node.next=head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node();
        node.value= val;
        tail.next=node;
        tail = node;
        size++;
    }

    public void insert(int val , int index){
        Node node = new Node();
        node.value=val;

        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;//temp is like a pointer
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        node.next = temp.next;
       temp.next =  node;
       size++;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0 ; i< index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail =secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        int val = head.value;
        head = head.next;

        if(head==null){
            tail = null;
        }

        size--;
        return val;
    }

    public int delete(int index){
        if(index ==0){
            return  deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public  void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
      //  System.out.println("END");
        System.out.println();
        System.out.println("size of ll is  : "+size);

    }
    private class Node{
        private int value;
        private Node next;

//        public Node(int value){
//            this.value=value;
//        }
//        public Node(int value,Node next){
//            this.value=value;
//            this.next=next;
//        }
    }
}
