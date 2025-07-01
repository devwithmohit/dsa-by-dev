import java.util.Arrays;

public class Array8 {
    public static void main(String1[] args) {
        // Dutch National Flag Algorithm – Sort 0s, 1s, 2s
        // Given an array of 0s, 1s, and 2s — sort them in-place in single pass (O(n)
        // time & O(1) space)

        // Maintain 3 pointers:

        // low → 0s end

        // mid → current index

        // high → 2s start
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
