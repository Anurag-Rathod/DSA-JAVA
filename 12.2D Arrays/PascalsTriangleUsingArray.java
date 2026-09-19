import java.util.Scanner;
public class PascalsTriangleUsingArray {
    public static void pascals(int n){
        int ans[][] = new int[n][];//jagged array : Jagged Arrays are special types of Multidimensional arrays which have variable number of columns. It is an array of arrays where each element is an array and can be of a different size
        for(int i=0;i<n;i++){
            //ith row have i+1 column
            ans[i] = new int[i+1];
            //1st and last elements of every column is 1
            ans[i][0] = ans[i][i] = 1;
            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sc.close();
        pascals(n);
    }
}
