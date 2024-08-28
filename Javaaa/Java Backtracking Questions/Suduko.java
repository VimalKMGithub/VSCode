public class Suduko {
    public void solveSudoku(char[][] board) {
        solveSudoku(board, 0, 0);
    }

    private boolean solveSudoku(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newRow, newCol;
        if (col == board.length - 1) {
            newRow = row + 1;
            newCol = 0;
        } else {
            newRow = row;
            newCol = col + 1;
        }
        if (board[row][col] != '.') {
            if (solveSudoku(board, newRow, newCol)) {
                return true;
            }
        } else {
            for (int i = 1; i <= board.length; i++) {
                char toCheck = (char) (i + '0');
                if (isSafe(board, row, col, toCheck)) {
                    board[row][col] = toCheck;
                    if (solveSudoku(board, newRow, newCol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char toCheck) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == toCheck) {
                return false;
            }
            if (board[i][col] == toCheck) {
                return false;
            }
        }
        int gridStartRow = 3 * (row / 3), gridStartCol = 3 * (col / 3);
        for (int i = gridStartRow; i < gridStartRow + 3; i++) {
            for (int j = gridStartCol; j < gridStartCol + 3; j++) {
                if (board[i][j] == toCheck) {
                    return false;
                }
            }
        }
        return true;
    }
}