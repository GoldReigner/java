//--------------------------------------------------------------------
//QUEUE USING CIRCULARARRAY AND HERE WE ARE TAKING ONLY TWO POINTERS I.E REAR AND FRONT
//=============================================================

public class queue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) %size == front;
        }
        //enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return ;
            }
            if(front == -1)
                front = 0;
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[0];
            //single element condition
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int top = arr[0];
            return  top;
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
