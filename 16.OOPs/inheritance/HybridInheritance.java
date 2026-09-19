package inheritance;

public class HybridInheritance {
    
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

class Mammal extends animal {
    int legs;
}
class Dogs extends Mammal{  
    String breed;
}