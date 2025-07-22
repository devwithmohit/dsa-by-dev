public class Bitmanupulation4 {
    public static void main(String[] args) {
        // A set bit in a binary number is a bit whose value is 1.
        // The set bits are the positions where you see 1
        // set bit simply means a bit that is "on" or equal to 1.
        int n = 12;
        System.out.println("Number of set Bits" + ":" + CountSetBits(n));

    }

    static int CountSetBits(int n) {

        // Count Set Bits (Brian Kernighan Algo)-It's an efficient way to count the
        // number of set bits (1s) in a binary number. The algorithm uses a clever bit
        // manipulation trick.

        int count = 0;
        while (n > count) {
            n = n & (n - 1);
            count++;
        }
        return count;

    }
}
