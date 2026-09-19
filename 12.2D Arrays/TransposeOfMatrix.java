import java.util.Scanner;
public class TransposeOfMatrix {
    public static void Transpose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];//When you transpose a matrix, the rows and columns swap, meaning that if your original matrix has r rows and c columns, the transposed matrix will have c rows and r columns.
        
        //loops are used to make transpose of given matrix
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of given matrix is : ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(ans[i][j]+" ");
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
        Transpose(matrix,r,c);
    }
}
