public class Bitmanupulation3 {
    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int pos = 1;

        // Get Bit
        System.out.println("Get Bit: " + getBit(n, pos)); // Output: 0

        // Set Bit
        System.out.println("Set Bit: " + setBit(n, pos)); // Output: 7 (0111)

        // Clear Bit
        System.out.println("Clear Bit: " + clearBit(n, 2)); // Output: 1 (0001)

        // Update Bit
        System.out.println("Update Bit: " + updateBit(n, 1, 1)); // Output: 7 (0111)
        System.out.println("Update Bit: " + updateBit(n, 2, 0)); // Output: 1 (0001)

    }
    // If both bits at the same position are 1, the result is 1.
    // If either bit is 0, the result is 0.

    static int getBit(int n, int pos) {
        return (n >> pos) & 1;

    }

    static int setBit(int n, int pos) {
        return n | (1 << pos);
    }

    static int clearBit(int n, int pos) {
        return n & ~(1 << pos);

    }

    static int updateBit(int n, int pos, int value) {
        n = clearBit(n, pos);
        return n | (value << pos);

    }

}
