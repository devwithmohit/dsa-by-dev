public class Array {
    // 1. 1D Array (Two-Dimensional / Matrix)
    static int[] arr = { 1, 2, 3, 4, 5 }; // 1D array
    String[] StrArr = { "Hello", " World " };

    public static void main(String[] args) {

        // Traversal - Traversal ka matlab: Array ke har element ko ek ek karke access
        // karna.
        if (arr.length > 0) {
            for (int count : arr) {
                System.out.println(count);
            }

            // 🔹 Access & Modify
            arr[1] = 346;
            System.out.println(arr[1]);

            // Traversing using for loop
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }
        }

    }
}
