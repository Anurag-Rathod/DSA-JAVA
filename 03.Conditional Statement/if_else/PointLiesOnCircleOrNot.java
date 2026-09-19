import java.util.*;
public class PointLiesOnCircleOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        System.out.print("Enter x-coordinate(center of circle) : ");
        int x = sc.nextInt();
        System.out.print("Enter y-coordinate(center of circle) : ");
        int y = sc.nextInt();
        System.out.print("Enter x-coordinate : ");
        int x1 = sc.nextInt();
        System.out.print("Enter y-coordinate : ");
        int y1 = sc.nextInt();
        sc.close();

        int lenght = (x1-x)^2 + (y1-y)^2;//formula for lenght of line ( (x1-x)^2 + (y1-y)^2 )1/2

        if(lenght > (radius^2)){
            System.out.print("Point lies outside the cicle ");
        }else if(lenght < (radius^2)){
            System.out.print("Point lies inside the cicle ");
        }else{
            System.out.print("Point lies on the cicle ");
        }
        
    }
}
