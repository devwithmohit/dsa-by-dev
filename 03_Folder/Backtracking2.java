
public class Backtracking2 {
    // Queen ek row me ek hi baar aa sakti hai (kyunki har row me ek hi queen
    // allowed hai).
    // Toh har row pe queen rakhne ki try kar, aur har row ke liye har column me
    // check kar ki safe hai ya nahi.
    public static void main(String[] args) {
        // Setup Nqueen Board
        int n = 4;
        char[][] Board = new char[n][n];
        // n = Board.length;
        // charater ka size bada hota thats why going array in charater

        // call Recursive function
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Board[i][j] = '.';
            }
        }
        // call backtracking solve method
        SolveQueen(Board, 0);

    }

    static void SolveQueen(char[][] Board, int col) {
        if (col == Board.length) {
            printBoard(Board);
            System.err.println("BaseCase");
            return;
        }

        for (int row = 0; row < Board.length; row++) {
            if (isSafe(Board, row, col)) {
                // place Queen
                Board[row][col] = 'Q';
                SolveQueen(Board, col + 1);
                Board[row][col] = '.'; // backtrack

            }

        }

    }

    static boolean isSafe(char[][] Board, int row, int col) {
        // check vertical
        for (int i = 0; i < row; i++) {
            if (Board[i][col] == 'Q')
                return false;
        }

        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Board[i][j] == 'Q')
                return false;
        }

        // upper-right diagonal ✅
        for (int i = row - 1, j = col + 1; i >= 0 && j < Board.length; i--, j++) {
            if (Board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static void printBoard(char[][] Board) {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();

        }

    }

}

// Board Sitting Arrangemnt
// (0,0) (0,1) (0,2) (0,3)
// (1,0) (1,1) (1,2) (1,3)
// (2,0) (2,1) (2,2) (2,3)
// (3,0) (3,1) (3,2) (3,3)
