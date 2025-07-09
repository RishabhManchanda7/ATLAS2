package Day15;

import java.util.*;



    class CNode {
        int data;
        Node left;
        Node right;

        // Constructor
        public CNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }
    // Main class to test the Node

public class Task1_node {
        public static void main(String[] args) {
            // Create nodes
            Node root = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);

            // Connect nodes to form a tree
            root.left = node2;  // Connect 2 as left child of 1
            root.right = node3; // Connect 3 as right child of 1

            // Print the tree values
            System.out.println("Root value: " + root.data);
            System.out.println("Left child: " + root.left.data);
            System.out.println("Right child: " + root.right.data);
        }
    }


