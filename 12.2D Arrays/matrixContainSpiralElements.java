//Q. Generate a n*n matrix filled with elements 1 to n^2 in spiral order.
import java.util.Scanner;
public class matrixContainSpiralElements {
    public static void spiralElementMatrix(int n){
        int topRow = 0, bottomRow = n-1, leftColumn = 0, rightColumn = n-1;
        int[][] ans = new int[n][n];
        int count = 1;
        while (count <= n*n) {
            // topRow => leftColumn to rightColumn
            for(int i=leftColumn;i<=rightColumn && count <= n*n ;i++){
                ans[topRow][i] = count;
                count++;
            }
            topRow++;

            // rightColumn => topRow to bottomRow
            for(int i=topRow;i<=bottomRow && count <= n*n;i++){
                ans[i][rightColumn] = count;
                count++;
            }
            rightColumn--;

            // bottomRow => rightColumn to leftColumn
            for(int i=rightColumn;i>=leftColumn && count <= n*n; i--){
                ans[bottomRow][i] = count;
                count++;
            }
            bottomRow--;

            // leftColumn => bottomRow to topRow
            for(int i=bottomRow;i>=topRow && count <= n*n;i--){
                ans[i][leftColumn] = count;
                count++;
            }
            leftColumn++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and column of Matrix : ");
        int n = sc.nextInt();
        sc.close();
        spiralElementMatrix(n);
    }
}
