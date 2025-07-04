package Day14;

class CNode {  // Changed from Node to CNode
    int data;
    CNode next;
    public CNode(int data) {
        this.data = data;
        this.next = this;  // Default circular reference
    }
}

class CircularLinkedList {
    private CNode tail;  // Changed to use CNode

    public void append(int data) {
        CNode newNode = new CNode(data);
        if (tail == null) {
            tail = newNode;
        } else {
            newNode.next = tail.next;  // Maintain circularity
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void traverse() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        CNode current = tail.next;  // Start from head (tail.next)
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);  // Until we circle back
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(10);
        cll.append(20);
        cll.append(30);
        cll.traverse();  // Output: 10 20 30
    }
}
