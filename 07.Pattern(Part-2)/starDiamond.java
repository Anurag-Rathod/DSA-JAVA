//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *
import java.util.Scanner;
public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sc.close();
        int nsp = n-1;
        int nst = 1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        nsp = 1;
        nst = 2*n-3;//nst -= 4;
        for(int i=1;i<n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }

        // METHOD 2
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    }
}
