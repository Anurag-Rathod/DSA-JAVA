import java.util.Scanner;
public class factorialsOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int n = sc.nextInt();
        sc.close();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;  // Exit if input is negative
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
            System.out.println("Factorial of " + i + " is " + fact);
        }
    }
}
