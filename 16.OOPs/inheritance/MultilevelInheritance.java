package inheritance;
public class MultilevelInheritance  {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.color = "black";
        d1.eat();
        d1.legs = 4;
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

class Mammal extends animal {
    int legs;
}
class Dogs extends Mammal{ //Multilevel inheritance 
    String breed;
}

