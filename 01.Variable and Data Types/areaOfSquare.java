import java.util.*;
public class areaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Square : ");
        int side = sc.nextInt();
        sc.close();

        int area = side*side;
        System.out.print("Area of string is : "+area);
    }
}
