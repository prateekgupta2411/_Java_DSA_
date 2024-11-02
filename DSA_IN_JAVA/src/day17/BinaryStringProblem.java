package day17;

public class BinaryStringProblem {
    public static void printBinaryStr(int n, int lastPlace, String str){

        // Base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // Kaam
        printBinaryStr(n-1,0,str + "0");
        if(lastPlace == 0){
            printBinaryStr(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryStr(3,0, "");
    }
}
