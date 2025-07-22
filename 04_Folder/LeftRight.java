public class LeftRight {

    public static void main(String[] args) {
        // Left << and Right >> shift operator

        // Left shift
        // a << b
        // Each bit ko left side me b times move karte ho
        // a << k = a * (2^k)

        // Right shift
        // a >> b
        // Each bit ko right side me b times move karte ho
        // a >> k = a / (2^k)

        // Left Shift (<<) = Left Grow = Multiply

        // Right Shift (>>) = Right Shrink = Divide
        int a = 5; // binary: 00000101
        int res = a << 1; // shift by 1 → 00001010 = 10
        System.out.println(res); // 10

        int b = 8; // binary: 00001000
        int response = b >> 1; // 00000100 = 4
        System.out.println(response); // 4

    }
}
