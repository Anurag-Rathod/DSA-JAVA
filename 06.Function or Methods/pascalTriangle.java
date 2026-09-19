//      1 
//     1 1 
//    1 2 1 
//   1 3 3 1 
//  1 4 6 4 1 
// 1 5 10 10 5 1 
import java.util.Scanner;
public class pascalTriangle {
    public static int fact(int x){
        int xFact = 1;
        for(int i=1;i<=x;i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows : ");
        int  n = sc.nextInt();
        sc.close();

        for(int i=0;i<=n;i++){
            for(int k=1;k<=n-i;k++){//loop for space
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){ //loop for numbers
                //combination = n!/(r!*(n-r)!)
                int nCr = fact(i)/(fact(j)*fact(i-j));
                System.out.print(nCr+" ");
            }
            System.out.println();
        }
    }
}
