//Leetcode 130. Surrounded Regions

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions{
    public static void bfs(int i, int j, char[][] board, boolean[][] isVisited){
        int m = board.length;
        int n = board[0].length;

        board[i][j] = '#';
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        isVisited[i][j] = true;

        int[][] directions = {{-1,0},{0,1},{0,-1},{1,0}};
        while(!q.isEmpty()){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            for(int[] dir : directions){
                int newX = x + dir[0];
                int newY = y + dir[1];

                if(newX >= 0 && newX < m && newY >= 0 && newY < n && board[newX][newY] == 'O' && isVisited[newX][newY] == false){

                    board[newX][newY] = '#';
                    isVisited[newX][newY] = true;
                    q.offer(new int[]{newX, newY});
                }
            }
        }
    }
    public static void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] isVisited = new boolean[m][n];

        // Top and bottom rows
        for (int j = 0; j < n; j++) {
            // Top row
            if (board[0][j] == 'O' && isVisited[0][j] == false) {
                bfs(0, j, board, isVisited);
            }
            // Bottom row
            if (board[m - 1][j] == 'O' && isVisited[m - 1][j] == false) {
                bfs(m - 1, j, board, isVisited);
            }
        }
        // Left and right columns
        for (int i = 0; i < m; i++) {
            // Left column
            if (board[i][0] == 'O' && isVisited[i][0] == false) {
                bfs(i, 0, board, isVisited);
            }
            // Right column
            if (board[i][n - 1] == 'O' && isVisited[i][n - 1] == false) {
                bfs(i, n - 1, board, isVisited);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O' && isVisited[i][j] == false){
                    board[i][j] = 'X';
                }
                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        solve(grid);
        /* grid =
        X X X X 
        X X X X 
        X X X X 
        X O X X 
        */

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}