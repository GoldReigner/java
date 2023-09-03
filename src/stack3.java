//--------------------------------------------------------------------
//push the element at the bottom of the stack
//=============================================================

import java.util.Stack;

public class stack3 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    //another way can be we can copy elements of one stack into the another
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4,s);
//        System.out.println(s.peek());
//        System.out.println(s.isEmpty());
        System.out.println("elements in list are : :");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
