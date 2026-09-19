package inheritance;
public class HierarchicalInheritance {
    public static void main(String[] args) {

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
// Hybrid inheritance
class human extends animal {
    int legs;
}
class man extends human{
    String name;
    int mobileNo;
}
class elephants extends animal{ 
    String breed;
}

