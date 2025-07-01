public class Array11 {
    public static void main(String1[] args) {
        // Traspose of Matrix
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int n = arr1.length;
        transposeMatrix(arr1, n);

    }

    static void transposeMatrix(int[][] arr1, int n) {
        for (int i = 0; i < n; i++) {
            // / swap matrix[i][j] with matrix[j][i]
            for (int j = i + 1; j < n; j++) {
                // Traspose of Matrix
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }

        }

        // Reverse a row

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {

                int temp = arr1[i][left];
                arr1[i][left] = arr1[i][right];
                arr1[i][right] = temp;
                left++;
                right--;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
