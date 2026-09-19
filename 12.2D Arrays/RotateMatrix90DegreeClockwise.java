//Rotate a matrix 90 degrees clockwise 
import java.util.Scanner;
public class RotateMatrix90DegreeClockwise {
    public static int[] swap(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static int[][] Transpose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void rotate(int matrix[][],int r,int c){
        int ans[][] = new int[c][r];// After transpose, the dimensions change (r -> c, c -> r)
        ans = Transpose(matrix, r, c);
        for(int i=0;i<c;i++){
            ans[i] = swap(ans[i]);
        }
        System.out.println("Rotate matrix 90 degrees clockwise :");
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
        rotate(matrix, r, c);
    }
}