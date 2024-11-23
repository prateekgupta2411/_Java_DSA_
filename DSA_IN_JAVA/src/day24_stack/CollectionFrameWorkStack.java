package day24_stack;

import java.util.Stack;

public class CollectionFrameWorkStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        while (!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
