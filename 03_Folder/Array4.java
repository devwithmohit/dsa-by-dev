public class Array4 {
    public static void main(String1[] args) {
        // Deletion
        int[] arr = { 1, 2, 3, 4, 5 };
        // Basic array Deletion
        // arr[arr.length - 3] = 0;

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }

        // delete from specified index
        for (int i = 2; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            // System.out.print(arr[i]);
            arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
