package Day14;

class FNode {
    int data;
    FNode next;
    FNode(int d) {
        data = d;
        next = this;  // Default circular reference
    }
}

public class Task1 {
    FNode tail;  // Using FNode instead of Node

    void add(int d) {
        FNode newNode = new FNode(d);
        if (tail == null) {
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void delete(int d) {
        if (tail == null) return;

        FNode prev = tail;
        FNode current = tail.next;

        do {
            if (current.data == d) {
                if (current == current.next) {  // Only one node
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) tail = prev;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }

    void print() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        FNode temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }

    public static void main(String[] args) {
        Task4 list = new Task4();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Original: ");
        list.print();  // Output: 10 20 30

        list.delete(20);
        System.out.print("After deletion: ");
        list.print();  // Output: 10 30

        list.delete(30);
        System.out.print("After second deletion: ");
        list.print();  // Output: 10

        list.delete(10);
        System.out.print("After final deletion: ");
        list.print();  // Output: List is empty
    }
}