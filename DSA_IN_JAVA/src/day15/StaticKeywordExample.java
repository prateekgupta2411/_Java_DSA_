package day15;

public class StaticKeywordExample {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        s1.schoolName = "Cdac";

        Studentss s2 = new Studentss();
        s2.schoolName = "St";
        System.out.println(s2.schoolName);
//
        Studentss s3 = new Studentss();
        System.out.println(s3.schoolName);
//
//        Studentss s4 = new Studentss();
//        System.out.println(s1.schoolName);

    }
}
class Studentss{
    String name;
    int rollNo;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
