package Day18;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Task18 {

    // Helper method to store nodes of alternate level in array
    void storeAlternate(Node node1, Node node2, int level, java.util.List<Integer> list) {
        if (node1 == null || node2 == null)
            return;

        if (level % 2 == 0) {
            list.add(node1.data);
            list.add(node2.data);
        }

        storeAlternate(node1.left, node2.right, level + 1, list);
        storeAlternate(node1.right, node2.left, level + 1, list);
    }

    // Helper method to modify nodes using the stored values
    void modifyTree(Node node1, Node node2, int level, java.util.Iterator<Integer> it) {
        if (node1 == null || node2 == null)
            return;

        if (level % 2 == 0) {
            node1.data = it.next();
            node2.data = it.next();
        }

        modifyTree(node1.left, node2.right, level + 1, it);
        modifyTree(node1.right, node2.left, level + 1, it);
    }

    void reverseAlternateLevels(Node root) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        storeAlternate(root.left, root.right, 0, list);
        java.util.Collections.reverse(list);
        modifyTree(root.left, root.right, 0, list.iterator());
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Task18 tree = new Task18();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Inorder before:");
        tree.inorder(root);

        tree.reverseAlternateLevels(root);

        System.out.println("\nInorder after reversing alternate levels:");
        tree.inorder(root);
    }
}