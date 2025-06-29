package Day13;

class Node1<T> {  // Generic type T
    T data;      // Can store any type
    Node1<T> next;

    Node1(T value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList1<T> {
    private Node1<T> head;

    public LinkedList1() {
        head = null;
    }

    // Insert at the end
    public void insertAtEnd(T value) {
        Node1<T> newNode = new Node1<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node1<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete by value (supports any type)
    public void deleteByValue(T value) {
        if (head == null) {
            return;
        }
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }
        Node1<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(value)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display the list
    public void display() {
        Node1<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class task4 {
    public static void main(String[] args) {
        // Example with Integers
        LinkedList1<Integer> intList = new LinkedList1<>();
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        System.out.print("Linked List (Integers): ");
        intList.display();

        // Example with Strings
        LinkedList1<String> strList = new LinkedList1<>();
        strList.insertAtEnd("Hello");
        strList.insertAtEnd("World");
        strList.insertAtEnd("!");
        System.out.print("Linked List (Strings): ");
        strList.display();
    }
}

