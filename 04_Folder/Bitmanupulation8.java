public class Bitmanupulation8 {
    public static void main(String[] args) {
        // hamming Distance - Hamming distance is the number of positions at which
        // corresponding bits in two numbers are different.
        int x = 1;
        int y = 5;
        System.out.println("Hamming Distance" + ":" + hammingDistance(x, y));

    }

    static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        System.out.println(xor);
        // // Count set bits in XOR result

        int distance = 0;
        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;

        }
        return distance;
    }
}
