package Day14;

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Adding elements
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        // Displaying elements
        System.out.println("Deque: " + deque); // Output: Deque: [5, 10, 20]
        // Removing elements
        System.out.println("Removed from front: " + deque.removeFirst()); // Output: 5
        System.out.println("Removed from back: " + deque.removeLast());   // Output: 20
        // Peek elements
        System.out.println("Front element: " + deque.peekFirst()); // Output: 10
    }
}