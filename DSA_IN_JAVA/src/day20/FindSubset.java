package day20;

public class FindSubset {
    public static void printSubSet(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion (kaam)
        // Yes choice - include the current character
        printSubSet(str, ans + str.charAt(i), i + 1);
        // No choice - exclude the current character
        printSubSet(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubSet(str, "", 0);
    }
}
