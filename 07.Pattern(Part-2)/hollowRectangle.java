// * * * * * * 
// *         * 
// *         * 
// * * * * * * 
import java.util.Scanner;
public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter number of column : ");
        int m = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");;
                }
            }
            System.out.println();
        }
    }    
}
