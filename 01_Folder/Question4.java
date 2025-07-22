// Move all negative elements to one side of the array

//  Two Pointer Partitioning (Like Dutch National Flag)
// Use two pointers: left starts from 0, right moves from start to end

// Whenever arr[right] is negative, swap with arr[left], and left++
public class Question4 {
    public static void main(String1[] args) {
        int[] arr = { 1, -2, 3, -4, 5, -6 };

        moveNegativesToLeft(arr);

        // Output
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveNegativesToLeft(int[] arr) {
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] < 0) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                // System.out.println(temp);

                left++;
            }
        }
    }
}
