package Binary_Tree;

//------ Hight of the tree -------//  

public class Classroom1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null; 
            this.right =  null;
        }
        
    }

    //------ Hight of the tree -------//  

    public static int hight(Node root){
        if (root == null) {
            return 0;
        }

        int lh = hight(root.left);
        int rh = hight(root.right);
        int hight =Math.max(lh, rh) + 1;
        return hight;
    }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    //------ count number of Nodes -------//  


    public static int countNodes(Node root){
        if (root == null) {
            return 0;
        }
        int lcount = countNodes(root.left);
        int rcount = countNodes(root.right);
        int total = lcount + rcount + 1 ;
        return total;
    }

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    //------ Sum of Nodes -------//  

    public static int sum(Node root){
        if (root == null) {
            return 0 ;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        int treesum = leftsum + rightsum + root.data;
        return treesum;
    }



// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    //------ Diameter of tree -------//  // O(n^2)
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }

        int ldiam = diameter(root.left);
        int lhight = hight(root.left);

        int rdiam = diameter(root.right);
        int rhight = hight(root.right);

        int selfHight = lhight + rhight + 1;

        int diam = Math.max(selfHight, Math.max(ldiam, rdiam));
        return diam;

    }

    public static void main(String[] args) {

        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
         */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);


        //------ count number of Nodes -------//  
        System.out.println(" Total number of roots is :- " + countNodes(root));


        //------ Sum of Nodes -------//  
        System.err.println(" Sum of Nodes is :- " + sum(root));


        //------ Hight of the tree -------//  
        System.out.println(" Hight of tree is :- " + hight(root));

        //------ Diameter of tree -------//  
        System.out.println("Diameter of tree :- " + diameter(root));

    }
}