import java.util.*;
public class sumAndProductOfTwoNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int b = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks
        //sum
        int sum = a+b;
        System.out.print("Sum of this two number is : "+sum);

        //product
        int product = a*b;
        System.out.print("product of this two number is : "+product);

    }
}
