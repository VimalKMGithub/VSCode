import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    public List<List<String>> solveNqueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        solveNqueens(board, 0, result);
        return result;
    }

    private void solveNqueens(char[][] board, int col, List<List<String>> result) {
        if (col == board.length) {
            List<String> tempList = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                tempList.add(new String(board[i]));
            }
            result.add(tempList);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 'Q';
                solveNqueens(board, col + 1, result);
                board[i][col] = '.';
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Nqueens sol = new Nqueens();
        System.out.println(sol.solveNqueens(4));
    }
}