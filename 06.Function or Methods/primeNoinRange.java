import java.util.Scanner;
public class primeNoinRange{
    
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;  // n is divisible by i, so it's not a prime number
            }
        }
        return true;  // n is prime
    }

    public static void isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers: ");
        int n = sc.nextInt();
        sc.close();

        isPrime(n);
    }
}
