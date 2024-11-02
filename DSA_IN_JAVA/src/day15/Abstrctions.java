package day15;

abstract class Animals {
    String color;

    Animals() {
//        color = "Brown";
        System.out.println("Animal constructor is called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    Horse() {
        System.out.println("Horse constructor is called");
    }
    void changeColor() {
        color = "dark Brown";
    }

    void walk() {
        System.out.println("walk on four legs");
    }
}

class Mustang extends Horse{
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}
class Chicken extends Animals {
    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walk on two legs");
    }
}

public class Abstrctions {
    public static void main(String[] args) {
//        Horse h1 = new Horse();
//        h1.walk();
//        h1.eat();
//        System.out.println(h1.color);
//        h1.changeColor();
//        System.out.println(h1.color);  // This will now print "dark Brown"

        Horse h1 = new Horse();
//        Mustang m1 = new Mustang();

    }
}
