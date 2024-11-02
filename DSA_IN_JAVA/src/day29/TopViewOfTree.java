package day29;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        // level order traversal
        Queue<Info> que = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0, max = 0;
        que.add(new Info(root,0));
        que.add(null);
        while (!que.isEmpty()){
            Info curr = que.remove();
            if(curr == null){
                if(que.isEmpty()){
                    break;
                }else {
                    que.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)){ //first time my hs is occur
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    que.add(new Info(curr.node.left,curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    que.add(new Info(curr.node.right,curr.hd+1));
                    max = Math.min(max, curr.hd+1);
                }
            }
        }
        for(int i = min;i<=max;i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root);
    }
}
