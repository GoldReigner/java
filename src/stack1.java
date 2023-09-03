import java.util.ArrayList;
//====================================================================================================================
//USING ARRAYLIST WE ARE IMPLEMENTING STACK
//=====================================================================================================================
public class stack1 {
    static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();//() inside it we write the initial capacity

        public static boolean isEmpty(){
            return list.size()== 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(list.size()==0){
                return -1;
            }
            else{
                int top = list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
        }

        public static int peek(){
            if(isEmpty()){
               return -1;
            }
            int data = list.get(list.size()-1);
            return data;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        //---------------------------------------------------------------------------------------------------------
        Stack.push(4);
        //instead of creating object we can also call the method by using class name and
        //it is recommended to call the methods of static class by using class name because it will help in
        //memory management:
   //----------------------------------------------------------------------------------------------------------------
        s.push(23);
        s.push(90);
        s.push(25);
        s.push(26);
        s.push(27);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println("elements in stack are ::: ");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
