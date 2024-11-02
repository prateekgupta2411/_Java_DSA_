package day14;

public class CheckOddOrEven {
    public static void check(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        check(2);
        check(3);
        check(5);
    }
}
