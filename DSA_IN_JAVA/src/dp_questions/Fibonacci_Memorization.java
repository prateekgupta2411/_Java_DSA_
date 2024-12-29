package dp_questions;

public class Fibonacci_Memorization {
    public static int printFibo(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] != 0){ // fib(n) already calculated
            return f[n];
        }
        f[n] =  printFibo(n-1, f) + printFibo(n-2, f);
        return f[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n+1];
        System.out.println(printFibo(n,f));
    }
}
