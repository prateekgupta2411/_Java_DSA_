package day31;

import java.util.ArrayList;

public class Root_TO_Leaf_Path_Print {
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
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer> path) {
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,6,1,4,10,11,14};
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root , value[i]);
        }
        inOrder(root);
        System.out.println();
        printRoot2leaf(root , new ArrayList<>());

    }
}

