import java.util.Scanner;
public class printMultiples {
    // Given a number num  and a value k, print k multiples of num
    // input n = 5 , k = 6
    // output 5 10 15 20 25 30 
    public static void printMultiple(int n,int k){
        //base case
        if(k==0){
            return;
        }
        //recusive work
        printMultiple(n, k-1);

        //self work
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Number : ");
        int n = sc.nextInt();
        System.out.print("Enetr k : ");
        int k = sc.nextInt();
        sc.close();
        printMultiple(n, k);
    }
}
