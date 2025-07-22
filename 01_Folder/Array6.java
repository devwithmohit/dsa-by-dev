public class Array6 {
    public static void main(String1[] args) {
        // Differnce Array -Tumhare paas ek array hai, aur tum multiple baar range me +k
        // add karna chahte ho.
        int count = 5;
        int[] arr = new int[count];
        int[] diff = new int[count + 1];

        diff[1] += 5;
        diff[4] -= 5;
        // Start index me +5 karo

        // End+1 index me -5 karo

        // Jab prefix sum loge toh effect sirf [1,3] range me apply hoga

        diff[2] += 10;
        diff[5] -= 10; // 4 + 1 = 5
        arr[0] = diff[0];
        for (int i = 1; i < count; i++) {
            int sum = arr[i] = arr[i - 1] + diff[i];
            // Step-by-step:
            // arr[0] = 0

            // arr[1] = arr[0] + diff[1] = 0 + 5 = 5

            // arr[2] = arr[1] + diff[2] = 5 + 10 = 15

            // arr[3] = arr[2] + diff[3] = 15 + 0 = 15

            // arr[4] = arr[3] + diff[4] = 15 + (-5) = 10

            System.out.println(sum);
        }

    }
}
