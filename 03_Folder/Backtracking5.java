public class Backtracking5 {

    // Rat in Maze

    public static void main(String[] args) {
        int[][] rateBoard = {
                { 1, 1, 0, 0 },
                { 1, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 1, 1, 0, 1 },
        };

        int n = rateBoard.length;
        int[][] path = new int[n][n];
        if (Raterace(rateBoard, 0, 0, path, n)) {
            printPath(path);
        } else {
            System.out.println("not found");
        }
    }

    static boolean Raterace(int[][] rateBoard, int row, int col, int[][] path, int n) {
        // base call
        // jab hum last cell par paungaye hai
        if (row == n - 1 && col == n - 1) {
            path[row][col] = 1;
            return true;
        }
        // ❌ Invalid move
        if (row < 0 || col < 0 || row >= n || col >= n || rateBoard[row][col] == 0) {
            return false;

        }

        path[row][col] = 1;

        if (Raterace(rateBoard, row + 1, col, path, n)) {
            return true;

        }
        if (Raterace(rateBoard, row + 1, col, path, n)) {
            return true;

        }
        // ➡️ Move Right
        if (Raterace(rateBoard, row, col + 1, path, n)) {
            return true;
        }
        // 🔙 Backtrack
        path[row][col] = 0;
        return false;
    }

    static void printPath(int[][] path) {
        for (int[] row : path) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}