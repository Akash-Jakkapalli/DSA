public class Build_BST {
    // structure of node
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
    // insert node
    public static Node inseart(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = inseart(root.left, val);
        }else{
            // right subtree
            root.right = inseart(root.right, val);
        }
        return root;      
    }
    // inorder
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        int value[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = inseart(root, value[i]);
        }

        inorder(root);
        System.out.println();

    }
}
