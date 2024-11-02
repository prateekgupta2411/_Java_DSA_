package day9;

import java.util.Scanner;

public class ArrInput {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();// math marks
        marks[1] = sc.nextInt();// science marks
        marks[2] = sc.nextInt();// java marks
        System.out.println("Math marks : " + marks[0]);
        System.out.println("science marks : " + marks[1]);
        System.out.println("java marks : " + marks[2]);
        marks[2] = 99;
        System.out.println("updated java marks : " + marks[2]);
    }
}

