//     *     
//     *     
// * * * * * 
//     *     
//     *    
import java.util.Scanner;
public class starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        int mid = n/2 + 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(mid == i || mid==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");;
                }
            }
            System.out.println();
        }
    }    
}
