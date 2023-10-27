class Solution {
    static List<List<String>> l;
    public List<List<String>> solveNQueens(int n) {
			l=new ArrayList<>();
        char[][] board=new char[n][n];
        solve(board);
        return l;
        
    }
    public static boolean isSafe(char board[][], int i, int j) {
		int n = board.length;

		for (int k = 0; k < n; k++) {
			if (k == i)
				continue;
			if (board[k][j] == 'Q') {
				return false;
			}
		}

		for (int k = j - 1, m = i - 1; k >= 0 && m >= 0; k--, m--) {

			if (board[m][k] == 'Q') {
				return false;
			}
		}
		for (int k = j + 1, m = i - 1; k < n && m >= 0; k++, m--) {

			if (board[m][k] == 'Q') {
				return false;
			}
		}
		return true;

	}

	public static boolean place(char[][] board, int i, int j) {
		int n = board.length;

		if (i >= board.length){
            ArrayList<String> al=new ArrayList<>();
            for(int id=0;id<board.length;id++){
                StringBuilder sb=new StringBuilder();
                for(int id2=0;id2<board.length;id2++){
									if(board[id][id2]=='Q')
                    sb.append(board[id][id2]);
										else
										sb.append(".");
                }
                al.add(sb.toString());
            }
            l.add(al);
			return false;
        }

		for (int z = 0; z < n; z++) {

			if (isSafe(board, i, z)) {

				board[i][z] = 'Q';

				if (place(board, i + 1, 0) == true)
					return true;

				board[i][z] = '.';
			}
		}
		return false;
	}

	public static void solve(char[][] board) {

		place(board, 0, 0);

	}

}