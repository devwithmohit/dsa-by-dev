public class Array7 {
    public static void main(String1[] args) {
        // 1. Kadane’s Algorithm – Maximum Subarray Sum
        // Given an array arr[] integers (positive, negative, zero), find the contiguous
        // subarray with the maximum sum.

        // Approach - Har element pe decide karna hai:
        // Kya main previous subarray me add ho jaun?
        // Ya naya subarray shuru karu?

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int currentSum = arr[0];
        int Maxsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            System.out.println(currentSum);
            Maxsum = Math.max(Maxsum, currentSum);

        }
        System.out.println(Maxsum);
    }
}
