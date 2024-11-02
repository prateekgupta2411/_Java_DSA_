package day13;

public class PalindromeCheck {
    public static boolean checkpalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noonj";
        System.out.println(checkpalindrome(str));
    }
}
