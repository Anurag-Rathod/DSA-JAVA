package polymorphism;
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(1, 2));//3
        System.out.println(c1.add(1, 2,3));//6
        System.out.println(c1.add(4.4f, 9.9f));//14.299999
    }
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    float add(float a,float b){
        return a+b;
    }
}
