import java.util.Scanner;
public class sumOfTheDigits {
    public static void sum(int n){
        int lastDigit;
        int sum = 0;
        while(n>0){
            lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10;
        }
        System.out.println("Sum of digits are : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();
        
        sum(n);//function calling
        
    }
}
