//Leetcode 200 Number of Islands

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands{
    public static class Pair{
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void bfs(int i, int j, boolean[][] isVisited, char[][] grid){
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
            if(row-1 >= 0 && grid[row-1][col] == '1' && isVisited[row-1][col] == false){
                q.add(new Pair(row-1, col));
                isVisited[row-1][col] = true;
            }

            //Bottom -> row = row+1, col = col
            if(row+1 < n && grid[row+1][col] == '1' && isVisited[row+1][col] == false){
                q.add(new Pair(row+1, col));
                isVisited[row+1][col] = true;
            }

            //Left -> row = row, col = col-1;
            if(col-1 >= 0 && grid[row][col-1] == '1' && isVisited[row][col-1] == false){
                q.add(new Pair(row, col-1));
                isVisited[row][col-1] = true;
            }

            //Right -> row = row, col = col+1;
            if(col+1 < m && grid[row][col+1] == '1' && isVisited[row][col+1] == false){
                q.add(new Pair(row, col+1));
                isVisited[row][col+1] = true;
            }
        }
    }
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] isVisited = new boolean[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && isVisited[i][j] == false){
                    bfs(i,j,isVisited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int ans1 = numIslands(grid1);//1
        System.out.println(ans1);

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int ans2 = numIslands(grid2);//3
        System.out.println(ans2);
    }
}