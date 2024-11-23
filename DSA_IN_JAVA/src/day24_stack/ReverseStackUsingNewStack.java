package day24_stack;

import java.util.Stack;

public class ReverseStackUsingNewStack {

    // Method to reverse the stack
    public static void reverseStack(Stack<Integer> oldStack) {
        Stack<Integer> newStack = new Stack<>();

        // Pop elements from the old stack and push them to the new stack
        while (!oldStack.isEmpty()) {
            newStack.push(oldStack.pop());
        }

        // Print the reversed stack for verification
        System.out.println("Reversed Stack: " + newStack);
    }

    public static void main(String[] args) {
        Stack<Integer> oldStack = new Stack<>();
        oldStack.add(1);
        oldStack.add(2);
        oldStack.add(3);

        System.out.println("Original Stack: " + oldStack);

        reverseStack(oldStack);
    }
}
