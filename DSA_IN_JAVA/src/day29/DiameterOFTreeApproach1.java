package day29;

public class DiameterOFTreeApproach1 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static int diameter(Node root){ //O(n2)
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDia = lh + rh + 1;
        return Math.max(selfDia,Math.max(leftDia,rightDia));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
//        root.right.right = new Node(6);
        System.out.println(diameter(root));

    }
}
