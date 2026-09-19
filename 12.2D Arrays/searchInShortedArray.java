public class searchInShortedArray {
    public static boolean search(int[][] matrix,int key){
        int row=0,column=matrix[0].length-1;
        // Loop to traverse the matrix from top-right corner to bottom-left corner
        while (row<matrix.length && column>=0) {
            // If key is found, print the position and return true
            if(key==matrix[row][column]){
                System.out.println(key+" is present at index ("+row+","+column+")");
                return true;
            }
            // If key is smaller than the current element, move left (decrease column)
            else if(key<matrix[row][column]){
                column--;
            }
            // If key is larger than the current element, move down (increase row)
            else{
                row++;
            }
        }
        // If the key is not found, return false
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40}
                          ,{15,25,35,45}
                          ,{27,29,37,48}
                          ,{32,33,39,50}};
        int key = 33;
        search(matrix, key);

    }
}
