
public class Delete{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    // inorder
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    // delete a node in (BST)
    public static Node delete(Node root, int val){
        if (root == null) {
            return null;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{//voila

            // case-1 :- leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case-2 :- Single child
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // Case-3 :- Both children
            
        }
    }

    public static void main(String[] args) {
        int value[] = {5 ,4, 3, 2, 1};

        
    }
}