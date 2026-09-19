//Leetcode 463
import java.util.LinkedList;
import java.util.Queue;

public class IslandPerimeter {
    public static class Pair{
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void bfs(int i, int j, boolean[][] isVisited, int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i, j));
        isVisited[i][j] = true;
        
        while(!q.isEmpty()){
            Pair front = q.poll();
            int row = front.row;
            int col = front.col;

            //Top -> row = row-1, col = col
            if(row-1 >= 0 && grid[row-1][col] == 1 && isVisited[row-1][col] == false){
                q.add(new Pair(row-1, col));
                isVisited[row-1][col] = true;
            }

            //Bottom -> row = row+1, col = col
            if(row+1 < n && grid[row+1][col] == 1 && isVisited[row+1][col] == false){
                q.add(new Pair(row+1, col));
                isVisited[row+1][col] = true;
            }

            //Left -> row = row, col = col-1;
            if(col-1 >= 0 && grid[row][col-1] == 1 && isVisited[row][col-1] == false){
                q.add(new Pair(row, col-1));
                isVisited[row][col-1] = true;
            }

            //Right -> row = row, col = col+1;
            if(col+1 < m && grid[row][col+1] == 1 && isVisited[row][col+1] == false){
                q.add(new Pair(row, col+1));
                isVisited[row][col+1] = true;
            }
        }
    }
    public static int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] isVisited = new boolean[n][m];

        /* 
        outer: label hai, jo kisi loop ko ek naam deta hai.
        break outer; us label wale loop se bahar nikalta hai.
        Nested loops mein normal break sirf current loop ko rokta hai, jabki break outer specified outer loop tak exit karta hai.
        */
        outer:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && isVisited[i][j] == false){
                    bfs(i,j,isVisited,grid);
                    break outer;
                }
            }
        }
        
        int perimeter = 0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(isVisited[row][col] == true){
                    //Top -> row = row-1, col = col
                    if(row == 0 || grid[row-1][col] == 0){
                        perimeter++;
                    }
                    //Bootom -> row = row+1, col = col
                    if(row == n-1 || grid[row+1][col] == 0){
                        perimeter++;
                    }
                    //Left -> row = row, col = col-1
                    if(col == 0 || grid[row][col-1] == 0){
                        perimeter++;
                    }
                    //Right -> row = row, col = col+1
                    if(col == m-1 || grid[row][col+1] == 0){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
    public static void main(String[] args) {
        int[][] grid1 = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        int perimeter1 = islandPerimeter(grid1); //16
        System.out.println(perimeter1);

        int[][] grid2 = {{1}};
        int perimeter2 = islandPerimeter(grid2); //4
        System.out.println(perimeter2);

        int[][] grid3 = {{1,0}};
        int perimeter3 = islandPerimeter(grid3); //4
        System.out.println(perimeter3);
    }
}
