package day16;

public class PrintIncreasingOrder {
    public static void print(int num){
        if(num == 0){
            return;
        }
        print(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        print(10);
    }
}
