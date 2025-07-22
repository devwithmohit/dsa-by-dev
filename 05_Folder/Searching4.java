
public class Searching4 {
    public static void main(String[] args) {
        // Binary Search in Rotated Sorted Array

        int[] arr1 = {
                4, 5, 6, 7, 0, 1, 2
        };
        int key = 0;
        int index = BinarySearch(arr1, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    static int BinarySearch(int[] arr1, int key) {
        int low = 0, high = arr1.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr1[mid] == key) {
                return mid;
            }
            // check left side is sorted
            if (arr1[low] <= arr1[mid]) {
                if (key >= arr1[low] && key < arr1[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // check right side is sorted
            else {

                if (key >= arr1[low] && key < arr1[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

}
