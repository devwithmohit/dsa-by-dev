// Find all pairs in an array whose sum is equal to a given number.
// Array diya hai:
// Example: {2, 4, 3, 5, 7, 8, 9}
// Aur ek number diya hai, maan lo sum = 7.

// Aapko saare pairs dhoondhne hain jinka sum 7 ho.
// Example pairs: (2, 5), (4, 3)

// Simple Approach (Nested Loop):
// Har element ke liye, uske baad wale sab elements ke saath sum check karo.
public class Question5 {
    public static void main(String1[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 7;
        sumofArray(arr1, sum);

    }

    static void sumofArray(int[] arr1, int sum) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == sum) {
                    System.out.println(arr1[i] + "" + arr1[j]);

                }
            }

        }

    }
}