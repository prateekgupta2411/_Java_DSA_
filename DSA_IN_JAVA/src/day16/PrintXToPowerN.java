package day16;

public class PrintXToPowerN {
    public static int power(int x, int n){
        // base case
        if(n==1){
            return x;
        }
        int ans = x * power(x,n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(10,10));
    }
}
