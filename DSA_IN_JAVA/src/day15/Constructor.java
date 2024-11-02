package day15;
class Student{
    String name;
    int rollNo;
    Student (){
        System.out.println("Hi Constructor");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
