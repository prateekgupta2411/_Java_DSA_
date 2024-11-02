package day17;

public class FriendPairingProblem {

    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2) return n;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
