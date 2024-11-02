package day15;

// Define the Herbivore interface
interface Herbivore {
    void eatPlants();
}

// Define the Carnivore interface
interface Carnivore {
    void eatMeat();
}

// Bear class implements both Herbivore and Carnivore interfaces
class Bear implements Herbivore, Carnivore {

    // Implementation of Herbivore's method
    public void eatPlants() {
        System.out.println("Bear is eating plants.");
    }

    // Implementation of Carnivore's method
    public void eatMeat() {
        System.out.println("Bear is eating meat.");
    }
}

public class MultipleInheritance_Interface {
    public static void main(String[] args) {
        Bear bear = new Bear();

        // Calling both methods to demonstrate multiple inheritance
        bear.eatPlants();
        bear.eatMeat();
    }
}
