public class String6 {
    public static void main(String[] args) {
        String name1 = "mohit";
        String name2 = "omtighh";
        System.out.println(isAnagram(name1, name2));
        // Is array me ASCII table ke 256 characters (0 se 255 index) ke liye jagah hoti
        // hai.
        // Jab bhi aap freq[name.charAt(i)]++ likhte hain,
        // toh jis character par loop hai, uska ASCII value index ban jaata hai aur uski
        // count badh jaati hai.
        // Toh:
        // 'A' (ASCII 65), 'B' (66), ..., 'Z' (90)
        // 'a' (97), 'b' (98), ..., 'z' (122)
        // Aur koi bhi character (space, digit, symbol, etc.) bhi count ho sakta hai.
        // Jab bhi string me koi character repeat hota hai, us index par value update ho
        // jaati hai (count badh jaata hai).

        // Example:
        // Agar string hai "aAbBaa"

        // freq[65] = 1 ('A')
        // freq[66] = 1 ('B')
        // freq[97] = 3 ('a')
        // Summary:

        // 256 size ka freq array har ASCII character ka count rakh sakta hai.
        // Aap kisi bhi character ka count direct freq['character'] se dekh sakte hain.

    }

    static boolean isAnagram(String name1, String name2) {
        if (name1.length() != name2.length())
            return false;
        int[] freq = new int[256];
        for (int i = 0; i < name1.length(); i++) {
            freq[name1.charAt(i)]++;
            freq[name2.charAt(i)]--;

        }
        for (int count : freq) {
            if (count != 0)
                return false;

        }
        return true;

    }

}
