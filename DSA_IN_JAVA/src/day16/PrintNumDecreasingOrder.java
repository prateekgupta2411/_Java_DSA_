package day16;

public class PrintNumDecreasingOrder {
    public static void print(int num){
        //Base case
        if(num == 0){
            return;
        }
        System.out.print(num+" ");
        print(num -1);
    }
    public static void main(String[] args) {
        print(10);
    }
}
