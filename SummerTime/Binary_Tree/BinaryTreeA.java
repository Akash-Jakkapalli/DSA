package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeA {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buldeTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buldeTree(nodes);
            newnode.right = buldeTree(nodes);
            return newnode;
        }   
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        // pre-order Tree Travesals

        public static void preorder(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        // In-order Tree Travesals

        public static void inorder(Node root){
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }
    

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        // post-order Tree Travesals
        public static void postorder(Node root){
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        // Level order Travesals
        public static void levelorder(Node root){
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println(); // next line
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                
                }else{
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }

        }
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buldeTree(nodes);

        // // pre-order-
        // tree.preorder(root);

        // // In-order
        // tree.inorder(root);

        // // post-order
        // tree.postorder(root);

        // level order
        tree.levelorder(root);
        


    }

}