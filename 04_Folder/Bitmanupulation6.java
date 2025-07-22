public class Bitmanupulation6 {
    public static void main(String[] args) {
        // BitMasking-Bit masking is a technique to manipulate or check specific bits in
        // a number using bitwise operations.

        // 1. Set bit: num | (1 << pos)
        // 2. Clear bit: num & ~(1 << pos)
        // 3. Toggle bit: num ^ (1 << pos)
        // 4. Check bit: (num & (1 << pos)) != 0

        int num = 12;
        int pos = 2;

        // Create mask
        int mask = 1 << pos;

        // Check if bit is set
        boolean isSet = (num & mask) != 0;

        // Set a bit
        int setResult = num | mask;

        // clera a bit
        int clearBit = num & ~mask;

        System.out.println("Bit at POsition" + pos + " is set:" + isSet + setResult + clearBit);

    }

}