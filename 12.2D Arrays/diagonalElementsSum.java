import java.util.Scanner;
public class diagonalElementsSum {
    public static void diagonalSum(int[][] matrix,int n){
        int sum = 0;
        //brute force approach => time complexity = O(n^2)
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j){//primary diagonal
        //             sum += matrix[i][j];
        //         }
        //         if(i+j==n-1 && i!=j){//secondary diagonal
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        
        for(int i=0;i<n;i++){//time complexity = O(n)
            sum += matrix[i][i];// primary diagonal: In this case, i or j will be the same, so I replaced j with i
            if(i != n-1-i){ // i and j should not be equal, this condition is checking that
                sum += matrix[i][n-1-i];// secondary diagonal: The formula i+j==n-1 gives the value of j, so j=n-1-i
            }
        }
        System.out.println("sum of diagonal elements is : "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows and columns : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        diagonalSum(matrix,n);
    }
}
