package day14;

public class SetIthBit {
    public static void main(String[] args) {
        int i = 2;
        int num = 10;
        int bitMask = 1<<i;
        System.out.println(num | bitMask);
        }
    }

