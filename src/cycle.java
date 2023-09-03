class Node2{
    int value;
    Node2 next;
    Node2(int value){
        this.value = value;
    }
}
public class cycle {
    public  static Node2 head;
    public boolean isCycle(){
        // here we will use the FAST AND SLOW POINTER METHOD AND IT IS USED FOR MANY THINGS

        // ALSO KNOWN AS FLOYDS CYCLE FINDING ALGORITHM
        Node2 fast = head;
        Node2 slow = head;

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
    public static void main(String[] args) {
        Node2 first = new Node2(23);
        Node2 second = new Node2(25);
        Node2 third = new Node2(221);
        Node2 fourth = new Node2(23);
        Node2 fifth = new Node2(20);
        Node2 sixth = new Node2(29);
         head = first;
        //first.next  = second;
        head.next  = second;
        second.next = third;
        third.next  = fourth;
        fourth.next= fifth;
        fifth.next = sixth;
        sixth.next = third;
        cycle list = new cycle();
        System.out.println("cycle is present or not "+list.isCycle());
    }
}
