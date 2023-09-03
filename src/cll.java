public class cll {

    private Node head;
    private Node tail;

    public cll(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){ //inserting at last
        Node node = new Node();
        node.val = val;

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;//inserting at last
        node.next = head;
        tail = node;
    }

//    public void display(){
//        Node node = head;
//        if(head != null){
//            do{
//                System.out.print(node.val + "  -> ");
//                node = node.next;
//            }while ( node != head);
//        }
//        System.out.println("END");
//    }

    public void delete(int val){  //delete a particular node
        Node node = head;
        if(node == null){ //i.e head is null
            return;
        }

        if(node.val == val){ //if the element is present at first index
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;//here we are using two nodes as pointers n and node
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }

 public void display(){
        Node node = head;
        do{
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        while(node!=head);
     System.out.println("HEAD");
 }
    private class Node{
        int val;
        Node next;
    }
}
