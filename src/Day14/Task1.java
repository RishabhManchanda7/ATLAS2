package Day14;

class Node {
    int data;      // Data stored in the node
    Node next;    // Reference to the next node

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Method to link this node to another node
    public void linkTo(Node nextNode) {
        this.next = nextNode;
    }
}

// LinkedList class to manage our nodes
class LinkedList {
    private Node head;  // First node in the list
    private Node tail;  // Last node in the list

    // Add a new node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.linkTo(newNode);
            tail = newNode;
        }
    }

    // Traverse the list and print all elements (forward traversal)
    public void traverse() {
        System.out.println("Traversing the linked list:");

        Node current = head; // Start from the head
        while (current != null) {
            System.out.print(current.data + " "); // Print the data
            current = current.next; // Move to the next node
        }
        System.out.println(); // New line after traversal
    }
}

// Main class to test the LinkedList
public class Task1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        // Traversing the linked list
        list.traverse();
    }
}
