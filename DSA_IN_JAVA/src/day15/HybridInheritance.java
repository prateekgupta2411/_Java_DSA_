package day15;

class Animal{
    String color;

    void eat(){
        System.out.println("animals are eating");
    }
}

class  Fish {
    void swim(){
        System.out.println("fish are swim");
    }
}
class Shark extends Fish{
    void largest(){
        System.out.println("shar one of the largest fish in the world");
    }
}
class Bird {
    void fly(){
        System.out.println("birds are fly");
    }
}
class Mammal {
    void eat(){
        System.out.println("Mammals are eating");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("dogs are barking");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Shark s1 = new Shark();
    }
}
