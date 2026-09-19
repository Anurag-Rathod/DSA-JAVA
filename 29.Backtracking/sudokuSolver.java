//leetcode 37
public class sudokuSolver {
    public static boolean isValid(int row, int col, char num, char[][] board) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }
        // Check 3x3 box
        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    public static boolean solveSudoku(int row, int col, char[][] board) {
        if (row == 9) return true;

        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow++;
            nextCol = 0;
        }

        // Already filled
        if (board[row][col] != '.') {
            return solveSudoku(nextRow, nextCol, board);
        }

        for (char num = '1'; num <= '9'; num++) {
            if (isValid(row, col, num, board)) {
                board[row][col] = num;
                if (solveSudoku(nextRow, nextCol, board)) return true;
                board[row][col] = '.';
            }
        }

        return false;
    }
    public static void main(String[] args) {
        char[][] board = {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}
                        };

        solveSudoku(0,0,board);

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
