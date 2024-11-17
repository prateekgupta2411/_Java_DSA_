package day31;

public class Print_In_Range {
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
    public static void printInRanage(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRanage(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRanage(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRanage(root.left, k1, k2);
        }
        else {
            printInRanage(root.right, k1, k2);
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
        printInRanage(root, 5, 12);
    }
}
