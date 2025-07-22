public class Sorting3 {
    public static void main(String[] args) {
        // Insertion sort - Insertion Sort ek simple sorting algorithm hai jo array ko
        // sorted aur unsorted part me divide karta hai. Har element ko unsorted part se
        // uthakar sahi jagah par sorted part me insert karta hai.
        int[] arr = { 5, 1, 4, 2, 8 };
        insertionSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }
}
