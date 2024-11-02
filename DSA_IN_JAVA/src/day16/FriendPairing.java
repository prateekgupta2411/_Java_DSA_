package day16;

public class FriendPairing {
    public static int friendPair(int n){
        // base case
        if(n == 1 || n==2){
            return n;
        }
        // kaam
        // single friend
        int sf = friendPair(n-1);
        // pair
        int pair = n-1 * friendPair(n-2);

        int totalPair = sf + pair;
        return totalPair;
    }
    public static void main(String[] args) {
        int ans = friendPair(3);
        System.out.println(ans);
    }
}
