import java.util.*;
public class countNoOfDigitInNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;

        if(n==0) count = 1;
        while (n>0) {
            n/=10;
            count++;
        }
        System.out.print("No of Digits are : "+count);
    }
}