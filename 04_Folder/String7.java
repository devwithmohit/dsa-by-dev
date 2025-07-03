public class String7 {
    public static void main(String[] args) {
        // -Substring = A continuous block of characters in a string.
        // Examples:

        // String: "abcde"

        // ✅ "abc" → valid substring

        // ❌ "ace" → not a substring (kyunki beech ke letters missing hain)
        String block = "absgdhdi";
        System.out.println(block.substring(0, 5));

        // Subsequence :Characters that appear in the same order but not necessarily
        // continuous.

        // String: "abcde"

        // ✅ "ace" → valid subsequence
        // ❌ "aec" → not a valid subsequence (order break ho gaya)
    }

}
