//package Day13;
//import java.util.HashMap;
//
//public class Task20 {
//    private Node<T> tail;
//    private int size = 0;
//
//    private static class Node<T> {
//        T data;
//        Node<T> next;
//
//        public Node(T data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Add element to the end of the circular list
//    public void append(T data) {
//        Node<T> newNode = new Node<>(data);
//
//        if (tail == null) {
//            // First node
//            tail = newNode;
//            tail.next = tail; // Points to itself
//        } else {
//            // Insert after tail and update tail
//            newNode.next = tail.next;
//            tail.next = newNode;
//            tail = newNode;
//        }
//        size++;
//    }
//
//    // Display all elements by traversing the circular list
//    public void display() {
//        if (tail == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node<T> current = tail.next; // Start from head (tail.next)
//        int count = 0;
//
//        System.out.print("Circular List Elements: ");
//        do {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//            count++;
//
//            // Safety check in case we somehow missed the loop
//            if (count > size * 2) {
//                System.out.println("\nWARNING: Possible infinite loop detected!");
//                break;
//            }
//        } while (current != tail.next);
//
//        System.out.println("[loop back to head]");
//    }
//
//    // Display elements with multiple full traversals
//    public void displayMultipleTraversals(int numTraversals) {
//        if (tail == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        System.out.println("Displaying " + numTraversals + " full traversals:");
//        Node<T> current = tail.next; // Start from head
//        int traversalCount = 0;
//        int nodeCount = 0;
//
//        while (traversalCount < numTraversals) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//            nodeCount++;
//
//            if (current == tail.next) {
//                traversalCount++;
//                System.out.println("[completed traversal " + traversalCount + "]");
//            }
//
//            // Safety check
//            if (nodeCount > size * numTraversals * 2) {
//                System.out.println("\nWARNING: Possible infinite loop detected!");
//                break;
//            }
//        }
//    }
//
//    // Get the size of the circular list
//    public int size() {
//        return size;
//    }
//
//    public static void main(String[] args) {
//        Task20<String> clist = new Task20<>();
//
//        // Adding elements to the circular linked list
//        clist.append("11 pax done out of 36 @ 12.38");
//        clist.append("11 pax done out of 36 @ 12.48");
//        clist.append("16 pax at 13.04");
//        clist.append("7 pax done out of 36 @ 12.54");
//
//        // Display the circular linked list once
//        clist.display();
//
//        // Display multiple traversals to demonstrate circular nature
//        clist.displayMultipleTraversals(3);
//
//        // Print size
//        System.out.println("\nSize of circular list: " + clist.size());
//
//        // Add another element and display again
//        clist.append("11 pax done out of 36 @ 13.10");
//        clist.display();
//    }
//}
//
