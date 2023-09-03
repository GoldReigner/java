class Node1{
    int val;
    Node1 prev;
    Node1 next;
}

public class revisedll {
    public Node1 head = null;

    public void insertFirst(int value){
        Node1 node = new Node1();
        node.val = value;
        if(head == null){
            head = node;
            node.next = null;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void insertLast(int value){
        Node1 node = new Node1();
        Node1 node1 = head;
        Node1 node2 = null;
        node.val = value;
        if(head == null){
            head = node;
            node.next = null;
        }
        else {
            while(node1 != null){
                node2 = node1;
                node1 = node1.next;
            }
            node2.next = node;
            node.prev = node2;
            node.next = null;
        }
    }

    public void display(){
        Node1 node = head;
        while(node != null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        revisedll list = new revisedll();
        list.insertFirst(40);
        list.insertFirst(44);
        list.insertFirst(43);
        list.insertFirst(42);
        list.display();

        System.out.println();
        list.insertLast(55);
        list.display();
    }
}
