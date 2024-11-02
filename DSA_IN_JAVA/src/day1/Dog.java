package day1;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
