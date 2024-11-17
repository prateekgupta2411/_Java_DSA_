package day31;

public class Delete_BST {
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
    public static Node delete(Node root, int val) {
        if (root == null) { // Base case: if root is null
            return null;
        }
        if(root.data < val){
            root.right = delete(root.right, val);
        }
       else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else { //voile root ka data hee value ke equal h
            // case1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // case2 - single child
            if(root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case 3 - both children
            Node IS = findInoderSucessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInoderSucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root , value[i]);
        }
        inOrder(root);
        System.out.println();

        root = delete(root, 5);
        System.out.println();

        inOrder(root);
    }
}

