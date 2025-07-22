public class Sorting2 {
    public static void main(String[] args) {
        // Selection sort - Selection Sort ek simple sorting algorithm hai jo har pass
        // me array ka smallest (ya largest) element dhundta hai aur usko correct
        // position par swap karta hai.

        int[] arr = { 5, 1, 4, 2, 8 };
        selectionSort(arr);

        System.out.print("Sorted array - ");
        for (int num : arr) {
            System.out.print(num + " ");

        }

    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }
}