//Q.  given a grid (or maze) with m rows and n columns. A person starts at the top-left corner (0, 0) and wants to reach the bottom-right corner (m-1, n-1).
//The person can only move either right or down at any step.
//calculate the total number of unique paths from the start to the end point.
import java.util.Scanner;
public class MazePath {
    //here we calculate the total number of unique paths by 4 parameters (int cr,int cc,int er,int ec)
    public static int MazePath1(int cr,int cc,int er,int ec){
        if(cr==er && cc==ec) return 1;
        int rightWays = 0;
        int downWays = 0;
        if(cr==er){
            rightWays += MazePath1(cr,cc+1,er,ec);
        }
        if(cc==ec){
            downWays += MazePath1(cr+1,cc,er,ec);
        }
        if(cc<ec && cr<er){
            rightWays += MazePath1(cr,cc+1,er,ec);
            downWays += MazePath1(cr+1,cc,er,ec);
        }
        int totalWays = rightWays + downWays;

        return totalWays;
    }
    //here we calculate the total number of unique paths by 2 parameters (int m,int n)
    public static int MazePath2(int m,int n){
        if(m==1 && n==1) return 1;
        int rightWays = 0;
        int downWays = 0;
        if(m==1){
            rightWays += MazePath2(m,n-1);
        }
        if(n==1){
            downWays += MazePath2(m-1,n);
        }
        if(m>1 && n>1){
            rightWays += MazePath2(m,n-1);
            downWays += MazePath2(m-1,n);
        }
        int totalWays = rightWays + downWays;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Row's : ");
        int m = sc.nextInt();//No. of rows
        System.out.print("Enter No. of colums's : ");
        int n = sc.nextInt();//No. of colums
        sc.close();

        int cr = 0;//current row
        int cc = 0;//current column
        int er = m-1;//end row
        int ec = n-1;//end column
        int totalWay1  = MazePath1(cr,cc,er,ec);
        System.out.println(totalWay1);

        int totalWay2  = MazePath2(m,n);
        System.out.println(totalWay2);
    }
}
