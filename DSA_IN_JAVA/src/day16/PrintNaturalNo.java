package day16;

public class PrintNaturalNo {
    public static int print(int num){
        if(num == 0){
            return 0;
        }
        return num + print(num-1);
    }
    public static void main(String[] args) {
        System.out.println(print(5));
    }
}
