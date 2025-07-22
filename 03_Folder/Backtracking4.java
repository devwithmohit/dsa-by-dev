public class Backtracking4 {
    public static void main(String[] args) {
        // word serach problem

        char[][] wordBoard = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }

        };
        String word = "ABCCED";
        // wordSearch(wordBoard, word);
        System.out.println(wordSearch(wordBoard, word)); // Output: true

        // not initialsizing array in that way - give array initiazing errorr
        // wordBoard = {
        // {
        // 'A','B','C','D' },
        // {'E','Q','P','O',},
        // {'M','G','N','L', },
        // {
        // 'H','I','J','K'}
        // }
    }

    static boolean wordSearch(char[][] wordBoard, String word) {
        // length starting hoti hai from 1
        int row = wordBoard.length;
        int col = wordBoard[0].length;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                // System.out.println(i + "" + j);
                // Start search from every cell
                if (isgood(wordBoard, word, i, j, 0))
                    return true;
            }
        }
        return false;

    }

    static boolean isgood(char[][] wordBoard, String word, int row, int col, int idx) {

        if (idx == word.length())
            return true;

        if (row < 0 || col < 0 || row >= wordBoard.length || col >= wordBoard[0].length
                || wordBoard[row][col] != word.charAt(idx))
            return false;

        // save cuurent character and visited
        char temp = wordBoard[row][col];
        wordBoard[row][col] = '#';

        boolean found = isgood(wordBoard, word, row - 1, col, idx + 1) || // up
                isgood(wordBoard, word, row + 1, col, idx + 1) ||
                isgood(wordBoard, word, row, col - 1, idx + 1) ||
                isgood(wordBoard, word, row, col + 1, idx + 1);
        // explainations
        // isgood(board, "ABCCED", -1, 0, 1) ❌ // Invalid index (row < 0)
        // isgood(board, "ABCCED", 1, 0, 1) ❌ // board[1][0] = 'S' ≠ 'B'
        // isgood(board, "ABCCED", 0, -1, 1) ❌ // Invalid index (col < 0)
        // isgood(board, "ABCCED", 0, 1, 1) ✅ // board[0][1] = 'B'

        wordBoard[row][col] = temp;
        return found;
    }

}

// Start from [i][j] →
// Match word.charAt(idx)
// |
// ├──→ UP (row - 1)
// ├──→ DOWN (row + 1)
// ├──→ LEFT (col - 1)
// └──→ RIGHT (col + 1)
// If no direction gives answer → backtrack

// You’re literally saying:

// row - 1 → ek upar jao

// row + 1 → ek neeche jao

// col - 1 → ek left jao

// col + 1 → ek right jao