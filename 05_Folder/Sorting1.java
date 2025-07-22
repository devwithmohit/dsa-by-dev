public class Sorting1 {

    public static void main(String[] args) {
        // Bubble sort -Bubble Sort ek simple sorting algorithm hai jo repeatedly
        // adjacent elements ko compare karta hai aur agar wo galat order me hain toh
        // swap karta hai. Ye process tab tak repeat hota hai jab tak array sorted nahi
        // ho jata.
        int[] arr = {
                5, 1, 4, 2, 8
        };
        int n = arr.length;
        bubbleSort(arr, n);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // System.out.println(arr[i] + "and" + arr[j]);
                // System.out.println(i + "and" + j);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}