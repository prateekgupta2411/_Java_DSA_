package day7;

public class Fact {
    public static int fact(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f = f * i;
        }
        return f;
    }
    public static int binCoff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);
        int binCof = (n_fact)/(r_fact*nmr_fact);
        return binCof;
    }
    public static void main(String[] args) {
//        int a = 7; // 5! = 5*4*3*2*1 =
//        int result = fact(a);
//        System.out.println(result);
        System.out.println(binCoff(5,2));
    }
}
