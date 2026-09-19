    // *             * 
    // * *         * * 
    // * * *     * * * 
    // * * * * * * * * 
    // * * * * * * * * 
    // * * *     * * * 
    // * *         * * 
    // *             *
import java.util.Scanner;
public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        //Upper Half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){//loop for stars
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++){//loop for spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){//loop for stars
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n;i>=1;i--){//agar kisi pattern ka miror(opposite) banaha ho to outer loop ko reverse kar do baki inner loop same logic pr work karenga
            for(int j=1;j<=i;j++){//loop for stars
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++){//loop for spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){//loop for stars
                System.out.print("* ");
            }
            System.out.println();
        }
        //method 2
        // //Upper Half
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){//loop for stars
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=n-i;k++){//loop for spaces
        //         System.out.print("  ");
        //     }
        //     for(int k=1;k<=n-i;k++){//loop for spaces
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){//loop for stars
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // //Lower Half
        // int nst = n;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){//loop for stars
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=i-1;k++){//loop for spaces
        //         System.out.print("  ");
        //     }
        //     for(int k=1;k<=i-1;k++){//loop for spaces
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=nst;j++){//loop for stars
        //         System.out.print("* ");
        //     }
        //     nst--;
        //     System.out.println();
        // }
    }
}
