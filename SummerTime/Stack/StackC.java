// Push at the Bottom of the Stack

import java.util.Stack;

public class StackC {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: If stack is empty, push the data and return
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        
        // Recursive case: Pop the top element and pushAtBottom recursively
        int top = s.pop();
        pushAtBottom(s, data);
        
        // Push the popped element back after inserting data at the bottom
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // Push 4 at the bottom of the stack
        pushAtBottom(s, 4);

        // Print stack elements (top to bottom)
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
