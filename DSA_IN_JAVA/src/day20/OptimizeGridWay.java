package day20;

public class OptimizeGridWay {
    public static int uniquePath(int n, int m){
        int N = n+m-2;
        int r = m-1;
        int ans = 1;
        for(int i=1;i<=r;i++){
            ans = ans * (N - r + i) / i; // Correct formula for combination
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(uniquePath(3,2));
    }
}
