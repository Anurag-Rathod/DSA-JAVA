//Q. You have a floor of size 2 x n (2 rows and n columns), and you are given 2 x 1 tiles (each tile covers two squares in a 2 x 1 manner).
// The task is to find the number of ways to tile the floor using these 2 x 1 tiles.
import java.util.Scanner;
public class TilingProblem {
    public static int tilingPro(int n){ // hame floor 2*n ka diya hua hai
        if(n==0 || n==1){
            return 1;
        }
        int  vertical = tilingPro(n-1);
        int horizontal = tilingPro(n-2);
        int totalWays = vertical + horizontal;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breath of floor : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(tilingPro(n));
    }    
}