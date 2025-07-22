
public class Backtracking3 {
    // // 1. ✅ Sudoku Solver using Backtracking
    // // Har empty cell ('.') pe 1–9 try karo → agar valid ho toh aage jao → agar
    // // kahin galti ho toh backtrack ka

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        if (SolveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists!");
        }
    }

    static boolean SolveSudoku(char[][] board) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, i, j, ch)) {
                            board[i][j] = ch;

                            if (SolveSudoku(board))
                                return true;

                            board[i][j] = '.'; // backtrack
                        }
                    }
                    return false; // koi bhi digit nahi baithi
                }
            }
        }
        return true; // sab cells fill ho gaye
    }

    static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch || board[i][col] == ch ||
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == ch)
                return false;
        }
        return true;
    }

    static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
