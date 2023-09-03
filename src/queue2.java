//--------------------------------------------------------------------
//QUEUE USING LINKED LIST
// =============================================================
public class queue2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //enqueue
        public static void add(int data) {
            Node node = new Node(data);
            if(tail == null){
                head = tail = node;
            }
            tail.next = node;
            tail = node;
        }

        //dequeue
        public static int remove() {
           if(isEmpty()){
               System.out.println("empty queue");
               return -1;
           }
           //if single element is present
            if(head == tail){
                tail = null;
            }
           int data = head.data;
           head = head.next;
           return data;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int top = head.data;
            return top;
        }

        public static void main(String[] args) {
            queue.Queue q = new queue.Queue(10);
            System.out.println(q.peek());
            q.add(34);
            q.add(32);
            q.add(37);
            q.add(38);
            System.out.println("elements in queue are : ::");
            while (!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
