package Day13;

class Node {
    int data; // Data part of the node
    Node next; // Pointer to the next node

    // Constructor for convenience
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head; // Pointer to the head of the list

    // Constructor to initialize an empty list
    public LinkedList() {
        head = null;
    }

    // Function to insert a node at the end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode; // If list is empty, make newNode the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Link the last node to newNode
        }
    }

    // Function to delete a Node by Value
    public void deleteByValue(int value) {
        if (head == null) {
            return; // List is empty
        }
        if (head.data == value) {
            Node temp = head;
            head = head.next; // Move head to the next node
            temp = null; // Help garbage collection
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next; // Traverse to find the node to delete
        }
        if (temp.next != null) {
            Node nodeToDelete = temp.next;
            temp.next = temp.next.next; // Unlink the node
            nodeToDelete = null; // Help garbage collection
        }
    }

    // Function to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Destructor equivalent in Java (not needed, but can be used for cleanup)
    public void clear() {
        head = null; // Help garbage collection
    }
}

public class Linked_list {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.print("Linked List: ");
        list.display();

        list.deleteByValue(20);

        System.out.print("After Deleting 20: ");
        list.display();
    }
}
