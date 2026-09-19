//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
import java.util.Scanner;
public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){//loop for space
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=(2*i)-1;j++){//loop for stars
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //method 2
        int nsp = n-1; 
        int nst = 1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){//loop for space
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){//loop for stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

        // int nsp = 0; 
        // int nst = n;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=nsp;k++){//loop for space
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=nst;j++){//loop for stars
        //         System.out.print("* ");
        //     }
        //     nsp++;
        //     nst -= 1;
        //     System.out.println();
        // }   

    }
}
