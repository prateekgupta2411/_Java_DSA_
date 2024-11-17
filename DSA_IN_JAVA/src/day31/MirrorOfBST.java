package day31;

public class MirrorOfBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }
        // Recursively create the mirror of subtrees
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        // Swap the left and right subtrees
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // Create the original BST
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        // Print the original BST in pre-order traversal
        System.out.println("Original BST (Pre-order):");
        preOrder(root);
        System.out.println();

        // Create the mirror of the BST
        root = createMirror(root);

        // Print the mirrored BST in pre-order traversal
        System.out.println("Mirrored BST (Pre-order):");
        preOrder(root);
    }
}
