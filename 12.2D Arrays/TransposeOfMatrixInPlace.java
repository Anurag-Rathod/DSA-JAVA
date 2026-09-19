import java.util.Scanner;
// this method is only work with square matrix 
public class TransposeOfMatrixInPlace {
    public static void TransposeInplace(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose of given matrix is : ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of Matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter column of Matrix : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        TransposeInplace(matrix,r,c);
    }
}
