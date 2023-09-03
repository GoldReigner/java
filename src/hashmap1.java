//put()
//get()
//containsKey()
//remove()
//size()
//keySet()
//HASHMAP IS IMPLEMENTED BY ARRAY OF LINKED LIST(IMP)
import java.util.*;
public class hashmap1 {
    static class HashMap<K,V> {//generics

        private class Node {
            K key;
            V value;

            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;//n - no of nodes
        private  int N ;//N - size of array or  no of buckets
        private LinkedList<Node> buckets[]; //N = buckets.length

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0 ; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;//4 % 5 = 4 (N-1)
            //7 % 5 = 2
        }
        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i = 0 ; i < ll.size() ; i++){
                if(ll.get(i).key == key){
                    return i;//di
                }
            }
            return -1;
        }
        private  void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0 ; i < N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0 ; i <oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j <ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);//if di > 0 already exist else make new linked list in bi
            if(di==-1){//key doesn't exist
                buckets[bi].add(new Node(key,value));
                n++;
            }else{// key exists
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lamda = (double) n/N;
            if(lamda > 2.0){//2.0 is k
                //rehashing
                rehash();

            }
        }
        public boolean containsKey(K key){
            return false;
        }
        public V remove(K key){
            return null;
        }
        public V get(K key){
            return null;
        }
        public ArrayList<K> keySet(){
            return null;
        }
        public boolean isEmpty(){
            return false;
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",100);

    }
}
