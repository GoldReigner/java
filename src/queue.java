import java.util.Queue;
//--------------------------------------------------------------------
//QUEUE USING ARRAY AND HERE WE ARE TAKING ONLY ONE POINTER I.E REAR
//=============================================================
public class queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear ==-1;
        }

        //enqueue
        public static void add(int data){       //O(n)
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){          //O(n)          //copying of elements is done here
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i < rear ; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek()
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            return front; //return arr[0];
             }
    }


    public static void main(String[] args) {
        Queue q = new Queue(10);
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
