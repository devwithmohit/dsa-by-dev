public class Array2 {
    public static void main(String1[] args) {
        
        
        
        // 2D Array Example
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };


        // traversal of 2D Array -Traversal ka matlab: Array ke har element ko ek ek karke access karna.
        for (int m = 0; m < matrix.length; m++) {
            // System.out.println("Row " + m + ":");
            for (int j = 0; j < matrix[m].length; j++) {
                
                
                
                // Access and Modify
                if (m == 1 && j == 1) {
                    matrix[m][j] = matrix[m][j] * 5;
                    
                }
                System.out.println(matrix[m][j] + "");

            }
            System.out.println(); // Print newline after each row
        }
    }
}