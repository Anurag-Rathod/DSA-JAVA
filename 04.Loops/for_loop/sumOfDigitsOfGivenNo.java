import java.util.Scanner;

public class sumOfDigitsOfGivenNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int x = 0;

        while (n>0) {
            x = n%10;
            sum += x;
            n/=10;
        }
        System.out.print("sum of digits are : "+sum);
        
    //print the product of all non zero digit of given number
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter any No : ");
    //     int n = sc.nextInt();
    //     sc.close();
    //     int product = 1;

    //     while (n>0) {
    //        int lastDigit = n%10;
    //         if(lastDigit==0) {
    //             n/=10;
    //             continue;
    //         }
    //         product *= lastDigit;
    //         n/=10;
    //     }
    //     System.out.print("Product of non zero digits are : "+product);
    }
}
