// Reverse the Stack -> (Recursion)

import java.util.Stack;
public class StackE {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: If stack is empty, push the data and return
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        
        s.push(top);
    }

    public static void reversStack(Stack<Integer>s){
        if (s.isEmpty()) { // base case
            return;
        }

        int top = s.pop(); 
        reversStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reversStack(s);
        printStack(s);

    }
}
