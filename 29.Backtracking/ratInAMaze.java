public class ratInAMaze { // 2 Directions (right or down)
    public static int maze(int i, int j, int rows, int cols){
        if(i == rows && j == cols){
            return 1;
        }
        if(i > rows || j > cols){
            return 0;
        }
        return maze(i+1,j,rows,cols) + maze(i,j+1,rows,cols);
    }
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int noOfWays = maze(0,0,rows,cols);
        System.out.println(noOfWays);
    }
}
