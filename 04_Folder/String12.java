
public class String12 {
    public static void main(String[] args) {
        // Pattern Matching in Strings
        String s = "hello java";
        System.out.println(s.contains("java")); // true
        // .startsWith() / .endsWith()
        String so = "codewithme";
        System.out.println(so.startsWith("code")); // true
        System.out.println(so.endsWith("me")); // true
        // .matches(regex) → Full Regex match
        String email = "abc@gmail.com";
        System.out.println(email.matches(".+@.+\\..+")); // true

    }

}
