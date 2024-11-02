package day15;

public class SuperEx {
    public static void main(String[] args) {
        Parlg h1 = new Parlg();
        System.out.println(h1.taste);
    }
}
class Buscuits{
    String taste;
    Buscuits(){
        System.out.println("this is Buscuits class Constructor");

    }
}
class Parlg extends Buscuits{
    Parlg(){
        super.taste = "good";
        System.out.println("this is Parlg class Constructor");
    }
}
