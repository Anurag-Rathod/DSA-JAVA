import java.util.*;
public class sumOfFirstNnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your last No :");
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int sum = 0;
        while(a<=n){
            sum += a;
            a++;
        }
        System.out.print("Total sum is : "+sum);
    }
}
