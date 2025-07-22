// ✅ Find the maximum and minimum element in an array
public class Question_2 {
    public static void main(String1[] args) {
        int[] arr = {12, 3, 45, 7, 99, 2};

        // Function call
        findMinMax(arr);
    }

    static void findMinMax(int[] arr) {
        // Step 1: Assume first element is both min and max
        int min = arr[0];
        int max = arr[0];

        // Step 2: Traverse array from index 1
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            // Step 3: Compare current with min and max
            if (current < min) {
                min = current;
                System.out.println("New Min Found: " + min);
            }
            if (current > max) {
                max = current;
                System.out.println("New Max Found: " + max);
            }
        }

        // Step 4: Final answer
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}

// Approach: Linear Scan (1 loop se min & max dono nikal lo)
// Hum ek hi loop me poore array ko traverse karenge aur:

// min ko har step pe update karenge agar current < min

// max ko har step pe update karenge agar current > max