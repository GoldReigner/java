//--------------------------------------------------------------------
//QUEUE USING COLLECTION FRAMEWORK
// =============================================================
import java.util.*;

public class queue3 {
    public static void main(String[] args) {

          //  @Override
//            public boolean add(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public boolean offer(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public Integer remove() {
//                return null;
//            }
//
//            @Override
//            public Integer poll() {
//                return null;
//            }
//
//            @Override
//            public Integer element() {
//                return null;
//            }
//
//            @Override
//            public Integer peek() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Integer> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//            }
       Queue<Integer> q = new LinkedList<>();
       // Queue<Integer> q = new ArrayDeque<>();
        //learn difference between araydeque and linkedlist

        //QUEUE IS A INTERFACE IN JAVA
        //QUEUE IS IMPLEMENTED BY LINKEDLIST AND ARRAYDEQUEUE
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
