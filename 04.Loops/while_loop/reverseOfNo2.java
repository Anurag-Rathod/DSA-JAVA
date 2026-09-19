import java.util.Scanner;

public class reverseOfNo2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int num = sc.nextInt();
        sc.close();
        int last_digit;
        int reverse_num = 0;

        while (num > 0) {
            last_digit = num % 10;
            reverse_num =  (reverse_num * 10) + last_digit;
            num = num/10; //num/=10; 
        }

        System.out.print("Reverse of Number is : "+ reverse_num);
    }
}
