public class ValidSudoku {
    
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    //row 
                    for (int k = 0; k < board.length; k++) {
                        if (i == k) {
                            continue;
                        }
                        if (board[i][j] == board[k][j]) {
                            return false;
                        }
                    }
                    //col
                    for (int k = 0; k < board.length; k++) {
                        if (j == k) {
                            continue;
                        }
                        if (board[i][j] == board[i][k]) {
                            return false;
                        }
                    }
                    //grid
                    int sr = 3 * (i / 3);
                    int sc = 3 * (j / 3);

                    for (int k = sr; k < sr + 3; k++) {
                        for (int l = sc; l < sc + 3; l++) {
                            if (i == k && j == l) {
                                continue;
                            }
                            if (board[i][j] == board[k][l]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}