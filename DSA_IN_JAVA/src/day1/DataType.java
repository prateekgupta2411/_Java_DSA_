package day1;

import day13.IntroductionOfString;

public class DataType {
    public static void main(String[] args) {
        // Integral Number
        // byte  , short, int , long
        byte age = 20;
        short age1 = 20;
        int age2 = 20;
        long age3  = 20;
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
        // Decimal Number
        // float, double

        // Character
        // char  // 2 byte

        char initial = 'z';
//        System.out.println((int) initial);
//        System.out.println((int) Character.MIN_VALUE);
//        System.out.println((int) Character.MAX_VALUE);
//        System.out.println((char) 10084);
        char heart = 10084;
//        System.out.println(heart);
        char hindiChar = 2309;
        char rightSymbol = '\u27A4'; // unicode value
//        System.out.println(rightSymbol);
//        System.out.println(hindiChar);

        for(int i=0;i<=127;i++){
//            System.out.println((char) i);
        }

        char charValue = 'A';
        int intValueChar = charValue; // Widening conversion from char to int
        float floatValueChar = charValue; // Widening conversion from char to float
//        System.out.println("cha: " + charValue);
//        System.out.println("int: " + intValueChar);
//        System.out.println("float: " + floatValueChar);
        // boolean  // 1 bit
        // widening // implicit // automatic conversion
        byte byteValue = 10; //1 byte
        short shortvalue = byteValue; //2 Byte
        int intValue = shortvalue; // 4
        long longvalue  = intValue; // 8
        float floatvalue = longvalue; //4
        double doubleValue = floatvalue; // 8

//        System.out.println("int" + intValue);
//        System.out.println("long" + longvalue);
//        System.out.println("float" + floatvalue);
//        System.out.println("double" + doubleValue);
//        System.out.println(Integer.toBinaryString(15255));

        long a = Long.MAX_VALUE;
        System.out.println(a);
        int b = (int) a;
        System.out.println(b);
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-1));
    }
}
