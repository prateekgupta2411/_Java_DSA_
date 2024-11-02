package day7;
public class ConvertBinToDec {
    public static void binaryToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal Num of " + myNum +" =  " + decNum);
    }
    public static void main(String[] args) {
        int n = 101;
        binaryToDec(n);
    }
}
