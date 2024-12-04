

public class Search_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }    
    }

    // Inseart
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

    // Search key in BST
    public static Boolean search(Node root, int key){  // O(H)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (root.data > key ) {
            return search(root.left, key);
            
        }else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int value[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // searching a key
        if (search(root, 2)) {
            System.out.println("Found");
        }else{
            System.out.println("Not - Found");
        }


        for(int i=0; i<value.length; i++){
            root = inseart(root, value[i]);
        }
        
        inorder(root);
        System.out.println();

    }
}
