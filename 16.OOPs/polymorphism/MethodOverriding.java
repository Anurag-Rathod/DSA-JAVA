package polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
