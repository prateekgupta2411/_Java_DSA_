package day7;

public class CallByValue_SwapFun {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
//        System.out.println("After swap the value of a is : " +a);
//        System.out.println("After swap the value of b is : " +b);
    }
    public static void main(String[] args) {
        int a  = 10;
        int b = 20;
        swap(a,b);
        System.out.println("After swap the value of a is : " +a);
        System.out.println("After swap the value of b is : " +b);
    }
}
