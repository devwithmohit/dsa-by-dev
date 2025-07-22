
public class Searching2 {
    public static void main(String[] args) {
        // Binary Search - Works on sorted arrays
        // Binary Search sorted array me kaam karta hai. Ye mid-point find karta hai aur
        // fir uske basis pe left ya right half me search karta hai.

        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int n = arr1.length;
        int key = 6;
        int response = BinarySearch(arr1, n, key);
        if (response != -1) {
            System.out.println("Key found at INdex : " + response);
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    public static int BinarySearch(int[] arr1, int n, int key) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr1[mid] == key) {
                return mid;
            } else if (arr1[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1; // key not found
    }
}
