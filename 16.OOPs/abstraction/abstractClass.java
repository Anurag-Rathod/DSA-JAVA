package abstraction;
// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Child class
class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        // Cannot create object of abstract class
        // Animal a = new Animal(); // Error

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
