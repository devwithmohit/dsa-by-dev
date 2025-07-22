public class String5 {
    public static void main(String[] args) {
        // get count of any string character
        String name = "mohitsinghrawat";
        checkFrequecy(name);
    }

    static void checkFrequecy(String name) {
        int[] freq = new int[256];

        for (int i = 0; i < name.length(); i++) {
            freq[name.charAt(i)]++;

        }
        for (int i = 0; i < freq.length; i++) {
            // System.out.println(freq);
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
            //  System.out.println("freq[" + i + "] = " + freq[i] + " (char: " + (char)i + ")");

        }

    }

}
// (char)i converts index back to character
// i=0, name.charAt(0) = 'm' → freq['m']++
// i=1, name.charAt(1) = 'o' → freq['o']++
// i=2, name.charAt(2) = 'h' → freq['h']++
// i=3, name.charAt(3) = 'i' → freq['i']++
// i=4, name.charAt(4) = 't' → freq['t']++
// i=5, name.charAt(5) = 's' → freq['s']++
// i=6, name.charAt(6) = 'i' → freq['i']++ (ab freq['i'] = 2)
// i=7, name.charAt(7) = 'n' → freq['n']++
// i=8, name.charAt(8) = 'g' → freq['g']++
// i=9, name.charAt(9) = 'h' → freq['h']++ (ab freq['h'] = 2)
// i=10, name.charAt(10) = 'r' → freq['r']++
// i=11, name.charAt(11) = 'a' → freq['a']++
// i=12, name.charAt(12) = 'w' → freq['w']++
// i=13, name.charAt(13) = 'a' → freq['a']++ (ab freq['a'] = 2)
// i=14, name.charAt(14) = 't' → freq['t']++ (ab freq['t'] = 2)
