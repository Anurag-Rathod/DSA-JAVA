import java.util.*;
public class largestOfTwoNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No : ");
        int num2 = sc.nextInt();
        sc.close();
        
        if(num1 > num2){
            System.out.print(num1+" is largest number");
        }else if(num1 == num2){
            System.out.print(num1+" and "+num2 + " is equal");
        }
        else{
            System.out.print(num2+" is largest number");
        }
    }
}
