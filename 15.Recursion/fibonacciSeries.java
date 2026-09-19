import java.util.*;
public class fibonacciSeries {
    public static int fibonacci(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        //self work + recursive work(subproblem)
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr N : ");
        int n = sc.nextInt();
        sc.close();
        // Print nth Fibonacci number
        System.out.println(n+"th fibonacci number is "+fibonacci(n));
        // Print the first n Fibonacci numbers
        System.out.println("first "+n+" fibonacci numbers are :");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }

        //print n fibonacci number using loops
        // int a  = 0;
        // int sum = 1;
        // for(int i=1;i<=n;i++){
        //    int ans = sum + a;
        //    System.out.print(ans+" ");
        //    a = sum;
        //    sum = ans;
        // }
    }
}
