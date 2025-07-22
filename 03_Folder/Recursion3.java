
public class Recursion3 {

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right)
            return;
        // swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left + 1, right - 1);

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        reverseArray(arr1, 0, arr1.length - 1);

        // Print reversed array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
