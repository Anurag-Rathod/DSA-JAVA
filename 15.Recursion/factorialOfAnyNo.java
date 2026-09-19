import java.util.*;
public class factorialOfAnyNo {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        sc.close();
        int fact = factorial(n);
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}
