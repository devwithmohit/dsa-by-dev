public class Array10 {
    public static void main(String[] args) {
        // 2. Row-wise & Column-wise Sorted Matrix
        // Matrix is sorted:

        // Each row is sorted left → right

        // Each column is sorted top → bottom
        int[][] arr2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int target = 8;
        boolean result = row_column(arr2, target);
        if (result) {
            System.out.println("Found target : " + result);
        } else {
            System.out.println("Not found target");
        }

    }

    static boolean row_column(int[][] arr2, int target) {
        int row = 0, col = arr2[0].length - 1;
        while (row < arr2.length && col >= 0) {
            if (arr2[row][col] == target) {
                return true;

            } else if (arr2[row][col] > target) {
                col--;

            } else {
                row++;
            }

        }
        return false;

    }
}
