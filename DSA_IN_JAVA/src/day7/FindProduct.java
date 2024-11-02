package day7;

public class FindProduct {
    public static int multiply(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(multiply(a,b));
        System.out.println(multiply(20,30));
        System.out.println(multiply(a,b));
    }
}
