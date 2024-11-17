package day32;

public class AVLTree {

    // Define the Node structure
    static class Node {
        int data, height; // Node data and its height in the tree
        Node left, right; // Pointers to left and right children

        Node(int data) {
            this.data = data; // Initialize node data
            this.height = 1;  // New node starts with height 1
        }
    }

    public static Node root; // Root node of the AVL Tree

    // Helper function to get the height of a node
    public static int height(Node root) {
        if (root == null) {
            return 0; // Height of null node is 0
        }
        return root.height; // Return the height of the node
    }

    // Perform a right rotation on the subtree rooted at y
    public static Node rightRotate(Node y) {
        Node x = y.left;  // x becomes the new root after rotation
        Node T2 = x.right; // T2 will be reassigned as y's left child

        // Perform the rotation
        x.right = y; // Move y under x as its right child
        y.left = T2; // Assign T2 as y's left child

        // Update heights after rotation
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return the new root
        return x;
    }

    // Perform a left rotation on the subtree rooted at x
    public static Node leftRotate(Node x) {
        Node y = x.right; // y becomes the new root after rotation
        Node T2 = y.left; // T2 will be reassigned as x's right child

        // Perform the rotation
        y.left = x; // Move x under y as its left child
        x.right = T2; // Assign T2 as x's right child

        // Update heights after rotation
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return the new root
        return y;
    }

    // Get the balance factor of a node
    public static int getBalance(Node root) {
        if (root == null) {
            return 0; // Null nodes are balanced
        }
        return height(root.left) - height(root.right); // Difference in heights
    }

    // Insert a new key into the AVL tree
    public static Node insert(Node root, int key) {
        // Step 1: Perform standard BST insertion
        if (root == null) {
            return new Node(key); // Create a new node if root is null
        }

        if (key < root.data) {
            root.left = insert(root.left, key); // Recur to the left subtree
        } else if (key > root.data) {
            root.right = insert(root.right, key); // Recur to the right subtree
        } else {
            return root; // Duplicate keys are not allowed
        }

        // Step 2: Update the height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Step 3: Check the balance factor to maintain AVL property
        int bf = getBalance(root);

        // Left Left Case (unbalanced due to insertion in left subtree)
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case (unbalanced due to insertion in right subtree)
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left Right Case (unbalanced due to insertion in left subtree's right child)
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left); // Perform left rotation on left child
            return rightRotate(root);         // Then perform right rotation
        }

        // Right Left Case (unbalanced due to insertion in right subtree's left child)
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right); // Perform right rotation on right child
            return leftRotate(root);             // Then perform left rotation
        }

        // Return the unchanged root if already balanced
        return root;
    }

    // Preorder traversal to print the tree structure
    public static void preOrder(Node root) {
        if (root == null) {
            return; // Base case: Do nothing for null nodes
        }
        System.out.print(root.data + " "); // Print the node's data
        preOrder(root.left); // Recur to the left subtree
        preOrder(root.right); // Recur to the right subtree
    }

    public static void main(String[] args) {
        // Insert nodes into the AVL tree
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        // Print the tree in preorder to verify structure
        preOrder(root);
    }
}
