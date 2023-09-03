import java.util.LinkedList;
import java.util.*;

public class tree1 {
    static class Node {
        Node leftchild;
        Node rightchild;
        int data;

        Node(int data) {
            this.data = data;
            this.leftchild = null;
            this.rightchild = null;
        }
    }
        static class binaryTree1{

            static int index = -1 ;
            static Node buildTree(int arr[]){
                index++;
                if(arr[index]== -1){
                    return null;
                }
                Node node = new Node(arr[index]);
                node.leftchild = buildTree(arr);
                node.rightchild = buildTree(arr);
                return node;
            }
            public static void preorder(Node root){
                if(root == null){
                    return;
                }
                System.out.print(root.data+" ");
                preorder(root.leftchild);
                preorder(root.rightchild);
            }
            public static void inorder(Node root){
                if(root == null)
                    return;
                inorder(root.leftchild);
                System.out.print(root.data+" ");
                inorder(root.rightchild);
            }
            public static void postorder(Node root){
                if(root==null)
                    return;
                postorder(root.leftchild);
                postorder(root.rightchild);
                System.out.print(root.data+" ");
            }
            public static void levelOrder(Node root){
                if(root==null)
                    return;
                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);

                while(!q.isEmpty()){
                    Node currNode = q.remove();
                    if(currNode == null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }else{
                            q.add(null);
                        }
                    }

                    else{
                        System.out.print(currNode.data+" ");
                        if(currNode.leftchild!=null){
                            q.add(currNode.leftchild);
                        }
                        if(currNode.rightchild!=null){
                            q.add(currNode.rightchild);
                        }
                    }
                }
            }
//=================================================================================================
            //PROBLEM: COUNT OF NODES         (POSTORDER : LEFT ,RIGHT , PRINT)
//------------------------------------------------------------------------------------------
            public static int countOfNodes(Node root){
                if(root == null){
                    return 0;
                }
                int leftNodes  = countOfNodes(root.leftchild);
                int rightNodes = countOfNodes(root.rightchild);

                return leftNodes + rightNodes + 1;
            }
//=================================================================================================
            //PROBLEM: SUM OF NODES
//------------------------------------------------------------------------------------------
            public static int sumOfNodes(Node root){
                if(root == null)
                    return 0;
                int leftSum = sumOfNodes(root.leftchild);//LEFTSUBTREE
                int rightSum= sumOfNodes(root.rightchild);//RIGHTSUBTREE

                return leftSum + rightSum + root.data;
            }
//=================================================================================================================
            //PROBLEM: HEIGHT OF TREE
//-----------------------------------------------------------------------------------------------------------------
            public static int height(Node root){
                if(root == null)
                    return 0;

                int leftHeight  = height(root.leftchild);   //LEFTSUBTREE
                int rightHeight = height(root.rightchild);  //RIGHTSUBTREE

                int myHeight = Math.max(leftHeight,rightHeight) + 1;
                return myHeight;
            }
//==================================================================================================================
            //PROBLEM: DIAMETER OF TREE       (APPROACH 1 : O(n^2)
//-------------------------------------------------------------------------------------------------------------------
            public static int diameter(Node root){
                if(root ==  null){
                    return 0;
                }
                int diam1 = diameter(root.leftchild);
                int dima2 = diameter(root.rightchild);
                int diam3 = height(root.leftchild) + height(root.rightchild) + 1;
                return Math.max(diam3,Math.max(diam1,dima2));
            }
            //==================================================================================================================
            //PROBLEM: DIAMETER OF TREE       (APPROACH 2 : O(n)
//-------------------------------------------------------------------------------------------------------------------
//            static class TreeInfo {
//                int ht;
//                int diam;
//
//                TreeInfo(int ht, int diam) {
//                    this.ht = ht;
//                    this.diam = diam;
//                }
//            }
//            public static TreeInfo diameter2(Node root) {//return type is treeinfo bec here we have to return both ht and diameter
//                if (root == null) {
//                    new TreeInfo(0, 0);
//                }
//                TreeInfo left = diameter2(root.leftchild);
//                TreeInfo right = diameter2(root.rightchild);
//
//                int myHeight = Math.max(left.ht,right.ht) + 1;
//
//                int diam1 = left.diam;
//                int diam2 = right.diam;
//                int diam3 = left.ht+right.ht + 1;
//
//                int mydiam = Math.max(Math.max(diam1,diam2),diam3);
//
//                TreeInfo myInfo = new TreeInfo(myHeight,mydiam);
//                return myInfo;
//            }
        }



    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree1 tree = new binaryTree1();
        Node root = tree.buildTree(arr);
        System.out.println(root.data);
        System.out.println("preorder::");
        tree.preorder(root);
        System.out.println();
        System.out.println("inorder::");
        tree.inorder(root);
        System.out.println();
        System.out.println("postorder::");
        tree.postorder(root);
        System.out.println();
        System.out.println("levelorder::");
        tree.levelOrder(root);

        System.out.println("no of nodes in the tree(COUNT) ::::"+tree.countOfNodes(root));  // O(n)
        System.out.println("sum of nodes in the tree is : "+tree.sumOfNodes(root));  //O(n)
        System.out.println("height of tree is "+ tree.height(root));
        System.out.println("diameter using approach1 : "+ tree.diameter(root));

       // System.out.println("diameter using approach2 : "+ tree.diameter2(root));

    }
}
