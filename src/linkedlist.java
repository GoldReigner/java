public class linkedlist {       //shradhaa di
    private int size;
    linkedlist(){
        size = 0;
    }
    public Node head ;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void  addFirst(int value){
        Node node = new Node(value);
        if(head ==null){
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=  null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("size of list is : "+size);
    }
    public int getSize(){
        return size;
    }

    public void reverseIterate1(){  //shradha di
        if(head == null|| head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public void reverseIterate2(){ //findout the error
        if(head == null && head.next ==null){
         return;
        }
        Node currentNode = head;
        Node prevNode = null;
        Node nextNode = head.next;
        while (currentNode != null) {
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        head = prevNode;
    }

    public void reverseIterate(){        //ABDUL BARI
        if(head == null && head.next == null ){
            return;
        }
        Node p = head;
        Node q = null;
        Node r = null;
        while(p!=null){
            r = q;
            q= p;
            p = p.next;
            q.next = r;
        }
        head = q;
    }

    public void recursiveReverse(Node q , Node p){
        if(p!=null){
            recursiveReverse(p,p.next);
            p.next = q;
        }else{
            head = q;
        }
    }

//  PROBLEM 1 ===================================================

    // find nth node from last and delete the node
    public void nthDelete(int n ){
        if(head.next ==null){
            return ;
        }
        Node p = head;
        int size = 1;
        while(p.next!= null){
            size++;
            p = p.next;
        }
        Node q = head;
        Node s = null;
        for(int i = 0; i< size-n+1 ; i++){
            s = q;
            q = q.next;
        }
        size--;
       // s.next = q.next;
      // s.next = p;
        s.next = s.next.next;
        System.out.println("size of list is inside the nth delete function is  : "+size);
    }
//====================================================================================ENDING

//PROBLEM 2===============================================================================
    //to check whether the linked list is palindrome or not
    //1st step : Middle of ll
    //2nd step : 2nd half reverse
    //3rd step : check 1st half and 2nd half
    public boolean palindrome(){
        if(head ==null || head.next ==null){
            return true;
        }

        Node slow = head;
        Node firsthalf = head;

        //1. middle of ll
        while ( firsthalf.next != null && firsthalf.next.next !=null){
            firsthalf = firsthalf.next.next;
//            if(firsthalf.next !=null){
//                firsthalf = firsthalf.next;
//            }
            slow = slow.next;
        }
        //2. reversing 2nd half of linked list
       Node secondhalf =  recursiveReverse1(null , slow);
        //System.out.println(secondhalf.next.next.data);

        //3. checking firsthalf and secondhalf
        while(secondhalf !=null) {
            //we have taken here secondhalf!=null because for odd no of linked list second half becomes null before firstHalf
            if (secondhalf.data != firsthalf.data){
                return false;
            }else{
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
            }
        }
        return true;
        }
    public Node recursiveReverse1(Node q ,Node p){
        if(p!=null){
            recursiveReverse(p,p.next);
            p.next = q;
        }else{
            head = q;
        }
        return head;
    }

    //========================================================ENDING

    public static void main(String[] args) {
       linkedlist list = new linkedlist();
       list.addFirst(1);
       list.addFirst(2);
       list.addFirst(3);
       list.addFirst(4);
       list.addFirst(5);
        System.out.println("size of list is: "+list.getSize());
       list.display();


//       list.reverseIterate();
//       list.display();

        list.recursiveReverse(null, list.head);
        list.display();

        System.out.println("delete ===");
        list.nthDelete(3);
        list.display();

        System.out.println(list.palindrome());

    }
}
