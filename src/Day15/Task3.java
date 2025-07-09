package Day15;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreeExample {
    Node root;

    // Constructor
    TreeExample() {
        root = null;
    }

    // Inorder traversal method
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        // First recur on left child
        inorderTraversal(node.left);

        // Then print the data of node
        System.out.print(node.data + " ");

        // Now recur on right child
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        TreeExample tree = new TreeExample();

        // Create nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        // Print inorder traversal
        System.out.println("Inorder traversal of simple tree:");
        tree.inorderTraversal(tree.root);
    }
}

// Task 2: Binary Search Tree with Inorder Traversal
class BinarySearchTree1 {
    private Node root;

    public BinarySearchTree1() {
        root = null;
    }

    // Insert operation 1: for empty tree
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            System.out.println(data + " inserted as root");
            return;
        }
        insert(root, data);
    }

    // Insert operation 2: for tree with one or more nodes
    private void insert(Node current, int data) {
        if (data < current.data) {
            if (current.left == null) {
                current.left = new Node(data);
                System.out.println(data + " inserted to the left of " + current.data);
            } else {
                insert(current.left, data);
            }
        }
        else if (data > current.data) {
            if (current.right == null) {
                current.right = new Node(data);
                System.out.println(data + " inserted to the right of " + current.data);
            } else {
                insert(current.right, data);
            }
        }
    }

    // Inorder traversal method
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree1 bst = new BinarySearchTree1();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal
        System.out.println("\nInorder traversal of BST:");
        bst.inorderTraversal();
    }
}