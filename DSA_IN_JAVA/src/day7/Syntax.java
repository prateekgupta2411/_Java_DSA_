package day7;

import java.util.Scanner;

public class Syntax {
    public static void printHello(){
        System.out.println("Hello");
    }
    public static int calculateSum(int num1, int num2){ //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
//        printHello();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);// arguments or actual parameters
        System.out.println("Sum of two no is : " + sum);
    }
}
