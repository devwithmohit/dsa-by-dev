public class Bitmanupulation1 {

    public static void main(String[] args) {
        // convert decimal to binary
        // Agar tumhare paas ek number hai jaise 13, toh tum usse repeatedly 2 se divide
        // karte ho aur remainders ko reverse order me likhte ho:
        int num = 10;
        // Built-in method
        // System.out.println(Integer.toBinaryString(num));
        String Binary = "";
        while (num > 0) {
            // convert decimal to binary
            Binary = (num % 2) + Binary;
            // conditions
            num = num / 2;

        }
        System.out.println(Binary);
    }
}