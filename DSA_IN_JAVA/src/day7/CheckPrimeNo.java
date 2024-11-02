package day7;

public class CheckPrimeNo {
    public static boolean isPrime(int n){

        //corner cases
        if(n == 2) return true;

        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)) { // true
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 20;
        primeInRange(n);
    }
}
