import java.util.Scanner;

public class builtinFunctions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No : ");
        int  n1 = sc.nextInt();
        System.out.print("Enter 2nd No : ");
        int  n2 = sc.nextInt();
        System.out.print("Enter 3rd No : ");
        int  n3 = sc.nextInt();
        System.out.print("Enter 4th No : ");
        int  n4 = sc.nextInt();
        sc.close();

        System.out.println(Math.max((Math.max(n2, n1)),(Math.max(n3, n4))));
        System.out.println(Math.min((Math.min(n2, n1)),(Math.min(n3, n4))));
    }
}