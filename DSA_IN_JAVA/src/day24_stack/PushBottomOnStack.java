package day24_stack;

import java.util.Stack;

public class PushBottomOnStack {
    public static void pushOnBottom(Stack<Integer> s1, int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        pushOnBottom(s1,data);
        s1.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        pushOnBottom(s1,4);
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
