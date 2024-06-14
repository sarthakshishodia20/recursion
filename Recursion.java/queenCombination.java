public class queenCombination {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        combination(tq, board, 0, "", 0);
    }

    public static void combination(int tq, boolean[] board, int qpsf, String ans, int idx) {
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true; // queen placed
                combination(tq, board, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
                board[i] = false; // remove queen undo
            }
        }
    }
}
