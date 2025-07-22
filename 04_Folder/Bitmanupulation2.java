public class Bitmanupulation2 {
    public static void main(String[] args) {
        // convert Binary to Decimal
        String Binary = "1010";
        int result = 0;
        // Built in Methods
        // System.out.println(Integer.parseInt("1010", 2));  // 10
        for (int i = 0; i < Binary.length(); i++) {
            result = result * 2 + (Binary.charAt(i) - '0');

        }
        System.out.println(
                result);
    }

}
