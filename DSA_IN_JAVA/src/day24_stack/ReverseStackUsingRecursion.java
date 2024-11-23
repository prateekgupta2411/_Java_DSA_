package day24_stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {

    public static void pushOnBottom(Stack<Integer> s1, int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        pushOnBottom(s1,data);
        s1.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushOnBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            int ans = s.pop();
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        reverseStack(s);
        printStack(s);
    }
}
