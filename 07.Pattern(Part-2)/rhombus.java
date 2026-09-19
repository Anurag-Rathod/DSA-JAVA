//       * * * * 
//     * * * * 
//   * * * * 
// * * * *
import java.util.Scanner;
public class rhombus { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){//loop for space
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){//loop for stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
