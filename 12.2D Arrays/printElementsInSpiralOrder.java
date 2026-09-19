//Q. Return all elements of the matrix in spiral order.
import java.util.Scanner;
public class printElementsInSpiralOrder {
    public static void spiralPrint(int[][] matrix,int r,int c){
        int topRow = 0, bottomRow = r-1, rightColumn = c-1, leftColumn = 0;

        System.out.println("spiral order : ");
        int totalElements = 0;
        while (totalElements < r*c) { // r*c = no of elements in matrix
            //topRow => leftColumn to rightColumn
            for(int i=leftColumn;i<=rightColumn && totalElements < r*c;i++){
                System.out.print(matrix[topRow][i]+" ");    
                totalElements++;
            }
            topRow++;
            
            //rightColumn => topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElements < r*c;i++){
                System.out.print(matrix[i][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;

            // bottomRow => rightColumn to leftColumn
            for(int i=rightColumn;i>=leftColumn && totalElements < r*c;i--){
                System.out.print(matrix[bottomRow][i]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftColumn => bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElements < r*c;i--){
                System.out.print(matrix[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;
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
        spiralPrint(matrix,r,c);
    }
}
