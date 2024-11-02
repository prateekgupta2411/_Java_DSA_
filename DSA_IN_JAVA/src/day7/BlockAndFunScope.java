package day7;

public class BlockAndFunScope {
    public static void main(String[] args) {
        int a = 20;
        {
            a = 10;
            System.out.println(a);//10
            System.out.println(a);//10
        }
        System.out.println(a);//10
        System.out.println(a);//10
    }
}
