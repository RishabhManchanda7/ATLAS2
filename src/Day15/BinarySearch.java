package Day15;

class TreeNode1 {
    int value;
    TreeNode1 left, right;

    TreeNode1(int item) {
        value = item;
        left = right = null;
    }
}

public class BinarySearch {
    private TreeNode1 root;

    // First insert method (when tree is empty)
    public void insert(int value) {
        root = insertVal(root, value);
    }

    // Second insert method (recursive, for one or more nodes)
    private TreeNode1 insertVal(TreeNode1 node, int value) {
        if (node == null) {
            node = new TreeNode1(value);
            System.out.println(value + " inserted");
            return node;
        }

        if (value < node.value) {
            node.left = insertVal(node.left, value);
            System.out.println(value + " inserted to the left of " + node.value);
        }
        else if (value > node.value) {
            node.right = insertVal(node.right, value);
            System.out.println(value + " inserted to the right of " + node.value);
        }

        return node;
    }

    // Inorder traversal public method
    public void inorder() {
        inorderVal(root);
    }

    // Inorder traversal private implementation
    private void inorderVal(TreeNode1 node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.print(node.value + " ");
            inorderVal(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch();

        // Insert values
        bst.insert(10);
        bst.insert(50);
        bst.insert(40);
        bst.insert(70);
        bst.insert(5);

        // Print inorder traversal
        System.out.println("\nInorder traversal of Binary Search Tree:");
        bst.inorder();
    }
}