package Day14;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = this;
    }
}

public class Task4 {
    Node tail;

    void add(int d) {
        Node n = new Node(d);
        if (tail == null) {
            tail = n;
        } else {
            n.next = tail.next;
            tail.next = n;
            tail = n;
        }
    }

    void delete(int d) {
        if (tail == null) return;

        Node prev = tail, curr = tail.next;
        do {
            if (curr.data == d) {
                if (curr == curr.next) { // Single node
                    tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == tail) tail = prev; // Update tail if deleting last
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);
    }

    void print() {
        if (tail == null) return;
        Node temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
    }

    public static void main(String[] args) {
        Task4 list = new Task4();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Before: ");
        list.print(); // Output: 10 20 30

        list.delete(20);

        System.out.print("\nAfter: ");
        list.print(); // Output: 10 30
    }
}
