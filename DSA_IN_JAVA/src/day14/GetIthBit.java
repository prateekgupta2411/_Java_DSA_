package day14;

public class GetIthBit {
    public static int IthBit(int num, int i) {
        int bitmask = 1 << i;
        if ((num & bitmask) == 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(IthBit(10, 3));
    }
}
