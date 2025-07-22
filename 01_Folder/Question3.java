import java.util.Arrays;

public class Question3 {
    // ✅ Sort array with 0,1,2 (Already done — Dutch National Flag)
    public static void main(String[] args) {
        int[] arr1 = { 2, 2, 0, 0, 1, 1 };
        int low = 0;
        int mid = 0;
        int high = arr1.length - 1;
        while (mid <= high) {
            // System.out.println("mid = " + mid + ", arr1[mid] = " + arr1[mid]);
            if (arr1[mid] == 0) {
                int temp = arr1[low];

                arr1[low] = arr1[mid];
                arr1[mid] = temp;
                low++;
                mid++;
            } else if (arr1[mid] == 1) {
                mid++;

            } else {
                // arr1[mid] == 2
                int temp = arr1[mid];
                arr1[mid] = arr1[high];
                arr1[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr1));

    }

}

// Jab arr1[mid] == 2 hota hai:
// Matlab, current element 2 hai, aur humein 2s ko array ke end/right side me
// bhejna hai.

// Swapping ka matlab:
// arr1[mid] (jo 2 hai) ko arr1[high] (rightmost element) ke saath exchange kar
// do.

// Kaise hota hai?

// temp me arr1[mid] ki value store kar li (yani 2).
// arr1[mid] me arr1[high] ki value daal di.
// arr1[high] me temp (yani 2) daal diya.
// high-- se right pointer ek step left aa gaya.