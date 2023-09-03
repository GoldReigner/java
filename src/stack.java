//ll.java and linkedlist.java

// using linkedkist
public class stack {
    //--------------------------------------------------------------------------------------------------
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
        //---------------------------------------------------------------------------------------------
        static class Stack {
            public static Node head = null;

            public static boolean isEmpty() {
                    if (head == null) {
                        return true;
                    }
                return false;
            }

            public static void push(int data) {
                Node node = new Node(data);
                if (head == null) {
                    head = node;
                    return;
                }
                node.next = head;
                head = node;
            }

            public static int pop() {
                if (isEmpty()) {
                    return -1;
                }
                Node top = head;
                head = head.next;
                return top.data;
            }

            public static int peek() {
                if (isEmpty()) {
                    return -1;
                }
                 Node top = head;
                return top.data;
            }
        }
        //-----------------------------------------------------------------------------------------------------------------

        public static void main(String[] args) {
            Stack s = new Stack();
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

