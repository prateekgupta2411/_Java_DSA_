package day15;

class Pen{
    String color;
    int tip;

     void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
       tip = newTip;
    }
}
public class ClassesAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.color = "Blue";
        System.out.println(p1.color);
    }

}

