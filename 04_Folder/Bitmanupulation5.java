public class Bitmanupulation5 {
    public static void main(String[] args) {
        // check if the power of 2 - A number that is a power of 2 has exactly one set
        // bit (1) in its binary representation.
        int n = 12;
        System.out.println(n + "is power of 2" + ":" + isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        // using Brian Kernighan Algorithm
        return (n & (n - 1)) == 0;
    }

}

// steps
// If a number is power of 2, it has only one set bit
// When we subtract 1:
// All bits after the set bit become 1
// The set bit becomes 0
// When we AND these numbers:
// If result is 0 → Power of 2
// If result is not 0 → Not a power of 2