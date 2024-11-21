package day24;

import java.util.Stack;

public class ReverseStringUsingStack {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Reverse the string using the stack
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Compare the reversed string with the original
        return str.equals(reversedString.toString());
    }

    public static void main(String[] args) {
        String str = "madam"; // Change this to test different inputs
        System.out.println("Original String: " + str);

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
