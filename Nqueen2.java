public class Nqueen2 {
    
}
class Solution {
    private int count;

    public int totalNQueens(int n) {
        count = 0;
        solveNQueens(n, 0, new int[n]);
        
        return count;
    }

    private void solveNQueens(int n, int row, int[] queens) {
        if (row == n) {
            count++;
        } else {
            for (int col = 0; col < n; col++) {
                if (isSafe(row, col, queens)) {
                    queens[row] = col;
                    solveNQueens(n, row + 1, queens);
                }
            }
        }
    }

    private boolean isSafe(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || queens[i] - col == i - row || queens[i] - col == row - i) {
                return false;
            }
        }
        return true;
    }
}
