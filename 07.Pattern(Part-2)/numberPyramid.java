//         1 
//       1 2 3 
//     1 2 3 4 5 
//   1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 9
import java.util.Scanner;
public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){//loop for space
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){//loop for stars
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println();
        //character pyramid
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){//loop for space
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){//loop for stars
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
