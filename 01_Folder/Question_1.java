
// 🔄 Problem: Reverse an Array
// Input: [1, 2, 3, 4, 5]
// Output: [5, 4, 3, 2, 1]

// 🧠 Concept: "Two Pointer Approach"
// Ek pointer start me (left), ek end me (right). Jab tak left < right, dono elements ko swap karte raho.

public class Question_1 {
    public static void main(String1[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Print original array
        System.out.print("Original Array: ");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.print("Reversed Array: ");
        printArray(arr);
    }

    // Function to reverse array
    static void reverseArray(int[] arr) {
        int left = 0; // Pointing to the first index
        int right = arr.length - 1; // Pointing to the last index

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Print status after each swap
            System.out.print("Step: ");
            printArray(arr);

            // Move the pointers
            left++;
            right--;
        }
    }

    // Helper function to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
