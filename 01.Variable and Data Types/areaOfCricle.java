import java.util.*;
public class areaOfCricle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        float radius = sc.nextFloat();
        sc.close();
        float pi = 3.14f; // Use 'f' to indicate that it's a float, not a double
        float area = pi*radius*radius;
        System.out.print("Area of Circle : "+area);
    }
}
