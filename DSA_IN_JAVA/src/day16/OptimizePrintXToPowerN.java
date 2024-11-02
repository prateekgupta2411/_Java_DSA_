package day16;

public class OptimizePrintXToPowerN {
    public static int pow(int x, int n){
        if(n==0) return 1;

        // even case
        int halfPower = pow(x, n / 2);  // Calculate once and reuse

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;  // Use x for odd powers
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2,10));

    }
}
