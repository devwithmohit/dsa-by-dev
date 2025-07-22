
public class Question8 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, -2, 4 };
        if (hasZeroSumSubarray(arr)) {
            System.out.println("Subarray with sum 0 exists");
        } else {
            System.out.println("No subarray with sum 0");
        }
    }

    static boolean hasZeroSumSubarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
