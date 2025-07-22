public class Array5 {
    public static void main(String1[] args) {
        int[] arr = {
                34, 56, 67, 23, 12
        };
        int n = arr.length;
        // Prefix Sum Array Build
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        // Step 2: Query sum from index L to R
        // agr kisi specified index tak ka sum chaiye
        int L = 1;
        int R = 3;
        int sum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);
        System.out.println(sum);

    }

}
