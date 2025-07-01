public class Array3 {
    public static void main(String1[] args) {
        // Insertion- Java arrays are fixed size, so direct insertion at any index isn't
        // always possible unless you manage it yourself (like shifting).
        int[] arr1 = new int[6]; // array size declartion
        System.out.println(arr1.length);
        arr1[0] = 18;
        arr1[1] = 26;
        arr1[2] = 36;
        arr1[3] = 45;
        for (int i = 4; i > 2; i--) {
            arr1[i] = arr1[i - 1];
        }
        arr1[2] = 25;

        // printing the whole array
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]);
        }
    }

}
