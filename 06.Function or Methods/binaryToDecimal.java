import java.util.*;
public class binaryToDecimal{
    // Method to convert binary number to decimal
    public static void binaryToDecimalConverter(int n) {
        int binary = n;
        int last_digit;
        int decimal = 0;
        int pow = 0;

        // Convert binary to decimal
        while (n > 0) {
            last_digit = n % 10;
            if (last_digit != 0 && last_digit != 1) {
                System.out.println("Invalid binary input!");
                return; // Exit if the input contains invalid digits
            }
            decimal = decimal + (int)Math.pow(2, pow) * last_digit;
            pow++;
            n /= 10;
        }

        System.out.println("Decimal of " + binary + " number is = " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int n = sc.nextInt();
        sc.close();

        // Call the method to convert the binary number to decimal
        binaryToDecimalConverter(n);
    }
}
