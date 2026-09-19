import java.util.*;
public class reverseOfNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int num = sc.nextInt();
        sc.close();
        int last_digit;

        while (num > 0) {
            last_digit = num % 10;
            System.out.print(last_digit);
            num = num/10; //num/=10; 
        }
    }
}
