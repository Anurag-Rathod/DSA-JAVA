public class printPathsInRatInAMaze {
    public static void maze(int i, int j, int rows, int cols, StringBuilder sb){
        if(i == rows && j == cols){
            System.out.println(sb);
            return;
        }
        if(i > rows || j > cols){
            return;
        }
        sb.append("R");
        maze(i,j+1,rows,cols,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append("D");
        maze(i+1,j,rows,cols,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        StringBuilder sb = new StringBuilder("");
        maze(1,1,rows,cols,sb);
    }
}