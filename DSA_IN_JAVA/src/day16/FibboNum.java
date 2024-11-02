package day16;

import java.util.Spliterator;

public class FibboNum {
    public static int  fibbo(int num){
        if(num<2){
            return num;
        }
        int ans = fibbo(num-1) + fibbo(num-2);
        return ans;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fibbo(num));
        for (int i = 0; i <= num; i++) {
            System.out.print(fibbo(i) + " ");  // Print Fibonacci sequence up to n
        }
    }
}
