public class dll {
     private Node head = null;

    public void insertFirst(int val){
        Node node = new Node();
        node.val = val;
        if(head == null){
            head = node;
            node.prev = null;
            node.next = null;
        }else {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
//        if(head!= null) {
//            head.prev = node;
//        }
    }

    public void display(){
        Node node =head;
        Node last = head;
        while (node!=null){
            System.out.print(node.val +" -> ");
            last = node;
            node = node.next;
        }

        System.out.print(" END");
        System.out.println();
        System.out.println("Print in reverse : ");
        while (last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

     public void revdisplay(){
        Node last = head;
        Node rev = head;
        while(last!=null){
            System.out.print(last.val+" -> ");
            rev = last;
            last = last.next;
        }
         System.out.print("END");
         System.out.println();

        while(rev!=null){
            System.out.print(rev.val +" <- ");
            rev = rev.prev;
        }
         System.out.print("START");
    }

    public void insertPos(int index,int val){
        Node pos = head;
        for(int i = 0 ; i < index-1 ; i++){
            pos = pos.next;
        }
        Node node = new Node();
        node.val = val;

//        if (pos.next==null){
//            node.next = null;
//        }
//        node.next = pos.next;
//        pos.next = node;
//        node.prev = pos;
//        if(pos.next!=null) {
//            node.next.prev = node;
//        }
        if (pos.next!=null){
        node.next = pos.next;
        }
        pos.next = node;
        node.prev = pos;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void insertLast(int val){
        Node node = new Node();
        node.val = val;
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last.next !=null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }




    private  class Node{
        int val;
        Node next;
        Node prev;
    }

}
