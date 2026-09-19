// 1 
// 1 3
// 1 3 5
// 1 3 5 7
// 1 3 5 7 9
import java.util.Scanner;
public class oddNoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr No of Rows : ");
        int n = sc.nextInt();
        sc.close();

        for(int i=0;i<=n;i++){
            int a = 1;
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
        //without using variable
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(2*j+1+" ");
        //     }
        //     System.out.println();
        // }
    }
}
