package Day15;

class FNode {
    int data;
    Node left;
    Node right;

    public FNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Task2 {
    private Node root;

    // Constructor
    public Task2() {
        root = null;
    }

    // Insert operation 1: for empty tree
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            System.out.println(data + " inserted as root");
            return;
        }
        // If tree is not empty, call the second insert method
        insert(root, data);
    }

    // Insert operation 2: for tree with one or more nodes
    private void insert(Node current, int data) {
        if (data < current.data) {
            // Insert in left subtree
            if (current.left == null) {
                current.left = new Node(data);
                System.out.println(data + " inserted to the left of " + current.data);
            } else {
                insert(current.left, data);
            }
        }
        else if (data > current.data) {
            // Insert in right subtree
            if (current.right == null) {
                current.right = new Node(data);
                System.out.println(data + " inserted to the right of " + current.data);
            } else {
                insert(current.right, data);
            }
        }
        // If data is equal to current.data, ignore it (BST property: no duplicates)
    }

    // Main method to test the BST
    public static void main(String[] args) {
        Task2 bst = new Task2();

        // Testing insertions
        bst.insert(50);  // Will use first insert method (empty tree)
        bst.insert(30);  // Will use second insert method
        bst.insert(70);  // Will use second insert method
        bst.insert(20);  // Will use second insert method
        bst.insert(40);  // Will use second insert method
        bst.insert(60);  // Will use second insert method
        bst.insert(80);  // Will use second insert method
    }
}
