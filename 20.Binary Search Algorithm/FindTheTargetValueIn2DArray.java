public class FindTheTargetValueIn2DArray {
    public static boolean search(int[][] matrix,int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n*m-1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            // Convert the 1D mid index to 2D matrix coordinates (row and column)
            int midElement = matrix[mid/m][mid%m];

            if(target==midElement){
                return true;
            }
            else if(target > midElement){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},
                          {10,11,16,20},
                          {23,30,34,60}};
        int target = 3;
        System.out.println(search(matrix, target));
    }
}
