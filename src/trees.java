public class trees {

    static class Node{
        Node leftChild ;
        Node rightChild ;
        int data;
        Node(int data){
            this.data = data;
            this.leftChild = null;
            this.rightChild= null;
        }
    }

    static class binaryTree{
        static int index = -1;
        public static Node buildTree(int arr[]){
            index++;
            if(arr[index] == -1){
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.leftChild = buildTree(arr);
            newNode.rightChild = buildTree((arr));
            return newNode;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(arr);
        System.out.println(root.data);
    }
}
