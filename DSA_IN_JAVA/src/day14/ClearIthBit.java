package day14;

public class ClearIthBit {
    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        int bitmask = ~(1<<i);
        System.out.println(num & bitmask);
    }
}
