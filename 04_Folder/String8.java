public class String8 {
    public static void main(String[] args) {
        String name = "mohit";
        String name1 = "mht";
        // character match karne chaiye
        System.out.println(isSubsequence(name, name1));

    }

    static boolean isSubsequence(String name, String name1) {
        int i = 0, j = 0;
        while (i < name.length() && j < name1.length()) {
            if (name.charAt(i) == name1.charAt(j)) {
                j++;

            }
            i++;
        }
        return j == name1.length();
    }
}


// isSubsequence("abcde", "ace")     → true
// isSubsequence("abcde", "aec")     → false
// isSubsequence("abcde", "")        → true   (empty string is always a subsequence)
// isSubsequence("", "a")            → false
// isSubsequence("abcdefg", "afg")   → true

