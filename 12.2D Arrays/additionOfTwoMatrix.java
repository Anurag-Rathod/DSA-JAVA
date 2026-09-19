public class additionOfTwoMatrix {
    public static void main(String[] args) {
        //initializing 2D array
        int[][] arr1 = new int[2][2];//total numbers of elements in array => 2*2 = 4
        arr1[0][0] = 1;//
        arr1[0][1] = 1;
        arr1[1][0] = 1;
        arr1[1][1] = 1;
        int[][] arr2 = {{1,2},{1,2}};//another way of initializing 2D array

        int[][] ans = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

        //use of .length property to get length of 2d array
        // int row = arr1.length;
        // int column = arr1[0].length;
    }
}