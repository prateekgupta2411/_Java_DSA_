package day1;

public interface Animal {

    public static final int Max_Age = 6;

    public abstract void eat();
    void sleep();

    public static void info(){
        System.out.println("This is information part");
    }
    default void run(){ // concrete method
        this.eat();
        System.out.println("Animal is running");
    }

}
