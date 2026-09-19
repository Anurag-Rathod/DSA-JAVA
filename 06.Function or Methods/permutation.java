import java.util.Scanner;
public class permutation {
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

        //permutation = n!/(n-r)!
        int nPr = fact(n)/(fact(n-r));
        System.out.println("nPr is equal to : "+nPr);
    }
}
