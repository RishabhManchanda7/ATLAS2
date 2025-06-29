package Day13;

import java.util.LinkedList;

public class Task13 {
    public static void main(String[] args) {
        // Create a LinkedList and use it as a stack (LIFO)
        LinkedList<String> stack = new LinkedList<>();

        // Pushing elements onto the stack
        System.out.println("Pushing elements to stack:");
        stack.push("First");
        System.out.println("Pushed: " + "First" + " | Stack: " + stack);
        stack.push("Second");
        System.out.println("Pushed: " + "Second" + " | Stack: " + stack);
        stack.push("Third");
        System.out.println("Pushed: " + "Third" + " | Stack: " + stack);

        // Popping elements from the stack
        System.out.println("\nPopping elements from stack:");
        String element = stack.pop();
        System.out.println("Popped: " + element + " | Stack: " + stack);
        element = stack.pop();
        System.out.println("Popped: " + element + " | Stack: " + stack);
        element = stack.pop();
        System.out.println("Popped: " + element + " | Stack: " + stack);

        // Check if stack is empty
        System.out.println("\nStack empty? " + stack.isEmpty());
    }
}
