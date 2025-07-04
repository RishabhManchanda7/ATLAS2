package Day14;

import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        // Create and populate the stack
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        // Element to search for
        int target = 30;

        // Search for the element (returns distance from top)
        int position = myStack.search(target);

        if(position != -1) {
            // Convert to 1-based position from bottom (natural stack order)
            int actualPosition = myStack.size() - position + 1;
            System.out.println(target + " found at position: " + actualPosition);
        } else {
            System.out.println(target + " not found in stack");
        }
    }
}
