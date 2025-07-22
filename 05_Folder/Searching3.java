
public class Searching3 {
    public static void main(String[] args) {
        // First and Last Occurrence of an Element in Sorted Array
        // Note:
        // Agar key sirf ek hi baar hai, toh first aur last occurrence dono same index
        // honge.
        int[] arr1 = { 1, 2, 2, 2, 3, 4 };
        int key = 2;
        int first = firstOccurrence(arr1, key);
        int last = lastOccurrence(arr1, key);
        System.out.println("First occurrence of " + key + " is at index: " + first);
        System.out.println("Last occurrence of " + key + " is at index: " + last);
    }

    // first occurence
    static int firstOccurrence(int[] arr1, int key) {
        int low = 0, high = arr1.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr1[mid] == key) {
                result = mid;
                high = mid - 1; // search left half
            } else if (arr1[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // // first occurence
    static int lastOccurrence(int[] arr1, int key) {
        int low = 0, high = arr1.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr1[mid] == key) {
                result = mid;
                low = mid + 1;
            } else if (arr1[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return result;

    }
}
