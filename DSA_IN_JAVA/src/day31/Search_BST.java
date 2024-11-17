package day31;

public class Search_BST {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
            if (root == null) {
                return new Node(val);
            }
            if (root.data > val) {
                // left subtree
                root.left = insert(root.left, val);
            } else {
                // right subtree
                root.right = insert(root.right, val);

            }
            return root;
        }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            // Go to left side
           return search(root.left, key);
        }
        else{
            // Go to right side
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int value[] = {8,5,3,6,1,4,10,11,14};
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root , value[i]);
        }
        inOrder(root);
        System.out.println();
        if(search(root,7)){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
}
