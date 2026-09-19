import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        sc.close();

        int pow = 0;
        int binary = 0;
        while (n>0) {
            int remainder = n%2;
            binary = binary + remainder*(int)Math.pow(10, pow);
            n = n/2;
            pow++;
        }
        System.out.println("Binary number = "+binary);
    }
}
 