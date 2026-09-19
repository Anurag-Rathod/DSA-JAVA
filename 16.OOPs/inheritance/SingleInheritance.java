package inheritance;
public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of lion class
        lion L1 = new lion();
        
        // Calling the eat() method
        L1.eat();
    }
}

class animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class lion extends animal {
    int legs;

    void property() {
        System.out.println("King");
    }
}
