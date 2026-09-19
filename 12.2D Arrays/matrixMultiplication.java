import java.util.Scanner;
public class matrixMultiplication {
    public static void matrixMulti(int[][] matrix1,int r1,int c1,int[][] matrix2,int r2,int c2){
        if(c1 != r2){// Check if matrix multiplication is possible by verifying the number of columns in matrix1 equals the number of rows in matrix2
            return;
        }

        int ans[][] = new int[r1][c2];
        // Perform matrix multiplication
        for(int i=0;i<r1;i++){//row number
            for(int j=0;j<c2;j++){// column number
                for(int k=0;k<c1;k++){
                    /* ans[i][j] += ith row of matrix1 * jth column of matrix2. 
                       matrix1 me row constant rahegi or matrix2 me column constant rahenga,
                       but matrix1 me column change ho rahi hai har iteration me,or matrix2 me row change ho rahi hai har iteration me isiliye hamne 3rd loop use kiya hai
                    */
                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of 1st Matrix : ");
        int r1 = sc.nextInt();
        System.out.print("Enter column of 1st Matrix : ");
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter rows of 2nd Matrix : ");
        int r2 = sc.nextInt();
        System.out.print("Enter column of 2nd Matrix : ");
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        matrixMulti(matrix1, r1, c1, matrix2, r2, c2);
    }
}
