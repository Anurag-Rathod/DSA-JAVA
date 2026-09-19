import java.util.Scanner;

public class combination {
    public static int fact(int x){
        int xFact = 1;
        for(int i=1;i<=x;i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int  n = sc.nextInt();
        System.out.print("Enter r : ");
        int  r = sc.nextInt();
        sc.close();

        //combination = n!/(r!*(n-r)!)
        int nCr = fact(n)/(fact(r)*fact(n-r));
        System.out.println("nCr is equal to : "+nCr);
    }
}
