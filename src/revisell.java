import com.sun.jdi.IntegerValue;

class Node{
    int val;
    Node next;
}
public class revisell {
    public Node head = null;
    public Node tail = null;

    public void insertFirst(int val){
        Node node = new Node();
        node.val = val;

        node.next =head;
        head = node;

        if(head == null){
            head = node;
            tail = node;
        }
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.val+"  ->  ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void recursiveDisplay(Node node){
        if(node!= null){
            System.out.print(node.val+" -> ");
            recursiveDisplay(node.next);
        }
    }

//    public void insertLast(int value){
//        Node node = new Node();
//        Node n = head;
//        Node prev = n;
//        node.val = value;
//        if(head == null){
//            head = node;
//        }else{
//            while(n!= null){
//                prev = n;
//                n=n.next;
//            }
//            prev.next = node;
//            node.next = null;
//        }
//    }

    public void insertLast(int value){
        Node node = new Node();
        node.val = value;
        Node temp = head;
        if(head == null){
            head = node;
            node.next = null;
        }else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("no element is present in ll");
            return;
        }
        int val = head.val;
        Node p ;
        p = head;
        head = head.next;
        p.next =  null;
    }

    public void deleteLast(){
     Node temp;
     Node temp1 = null;
     Node temp2 = null;
     temp = head;
     while(temp != null){
         temp2 = temp1;
         temp1 = temp;
         temp = temp.next;
     }
        System.out.println("deleted element is : "+temp1.val);
     temp2.next = null;
    }

    public void deletePos(int index){
        Node pos = head;
        Node pre = null;
        for (int i = 0; i < index ; i++){
            pre = pos;
            pos = pos.next;
        }
        System.out.println(pos.val);
        pre.next = pos.next;
        pos.next = null;
    }

    public void reverselinkedlisteDisplay1(Node node){
        if(node!= null){
            reverselinkedlisteDisplay1(node.next);
            System.out.print(node.val+" -> ");
        }
    }

    public static void main(String[] args) {
        revisell list = new revisell();
        list.insertFirst(32);
        list.insertFirst(31);
        list.insertFirst(34);
        list.insertFirst(37);
      //  list.display();
        list.recursiveDisplay(list.head);
        System.out.println();
        System.out.println("reverse linked list is : ");
        list.reverselinkedlisteDisplay1(list.head);

        list.insertLast(33);
        System.out.println();
        list.display();
        list.insertLast(234);
        list.display();

        list.deleteFirst();
        System.out.println("first element is deleted  : ");
        list.display();

        list.deleteLast();
        System.out.println("after deleting last element we get   :  ");
        list.display();

        System.out.println("element deleted is : ");
        list.deletePos(2);
        list.display();

        list.insertLast(45);
        list.display();

    }
}
