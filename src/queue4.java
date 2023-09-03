//--------------------------------------------------------------------
// PROBLEM :::::::::::::QUEUE USING  2 STACKS
//IT IS NOT AN EFFICIENT WAY BECAUSE HERE ADD AND POP OPERATION IS OF O(n) complexity
// =============================================================
import java.util.*;
//LOGIC BEHIND THE PROBLEM
//STEP1: REMOVE ALL THE ELEMENTS FROM STACK1 AND COPY IT TO STACK2
//STEP2: PUSH THE NEW ELEMENT INTO THE STACK1
//STEP3: REMOVE ALL THE ELEMENTS FROM STACK2 AND COPY IT TO STACK1
public class queue4 {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty() ;
        }
        public static void add(int data){
            //step 1
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //step 2
            s1.push(data);//                         pushAtBottom
            //step 3
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
