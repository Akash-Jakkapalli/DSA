package LInkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }      
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Methods
    // Add First
    public void addFirst(int data){
        // Step 1 = create new node
        Node newNode = new Node( data);
        size++;
        if (head==null) {
           head = tail = newNode; 
           return;
        }
        // Step 2 = newNode next = node
        newNode.next = head;  // link

        // Step 3 = head = newnode
        head = newNode;

    }
    // Add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head = tail = newNode; 
            return;  
        }
        tail.next = newNode;
        tail = newNode; 
    }
    public void print(){
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add Node in the Middel
    public  void add(int idx, int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        // i ==idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }


    // Remove in a LL
    public int removeFirst(){
        // Creating 2 spetioal case
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0; // size
            return val;
        }
        int val = head.data;
        head = head.next;
        size--; // size
        return val;
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val = head.data;
            tail = head = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i=0; i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }

    
    public int itrSearch(int key){ // O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // not found
        return -1;
    }


    // slow-fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // slow +1
            fast = fast.next.next; // fast +2
        }
        return slow; // slow is MidNode
    }


    // Check if ll is Palindrome
    public boolean palindrome(){
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 :- find MidNode
        Node midNode = findMid(head);

        // step 2 :- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // step 3 :- check right half & left half
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
        }
        return true;
    }

    // Find and remove Nth 
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); 
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(1);

        // Add Node in the Middel (9)
        ll.add(3, 2);

        ll.print(); // 1 --> 2 --> 9 --> 3 --> 4 --> null

        // System.out.println("my size of LL is : "+ ll.size); // size of LL

        

        // remove LL First
        // ll.removeFirst();
        // ll.print();

        // remove LL Last
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(7));

        // System.out.println(ll.palindrome());
      
        
    }
}
