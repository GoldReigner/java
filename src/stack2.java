import java.util.*;
//-------------------------------------------------------------------------------------
//USING COLLECTION FRAMEWORK FOR STACK
//--------------------------------------------------------------------------------------------------
public class stack2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(23);
        s.push(89);
        s.push(29);
        s.push(83);
        s.push(58);
        s.push(79);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println("elements in list are : :");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
