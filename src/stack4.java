import java.util.Stack;

//--------------------------------------------------------------------
//reverse  the stack
//logic : reversing of stack elements is done with the help of pushatbottom method
//=============================================================
public class stack4 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
  public static void stackReverse(Stack<Integer> s){

        if(s.isEmpty()) {
            return;
        }
        int data = s.pop();
        stackReverse(s);
        pushAtBottom(data,s);

  }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("before reversing the elements : ");
        System.out.println("elements in list are : :");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            stackReverse(s);

            System.out.println("elements in list are : :");
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }

        }

    }
