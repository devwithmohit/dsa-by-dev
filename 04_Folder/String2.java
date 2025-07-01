public class String2 {
    public static void main(String[] args) {

        // == - Memory address (reference) - Check if both variables point to **same
        // object** in memory
        // `.equals()` - Value/content - Check if both strings ke **characters same
        // hain**
        // True case
        String stu = "bhai";
        String stu1 = "bhai";
        System.out.println(stu == stu1); // true
        // Because "java" ek string literal hai — JVM ise String Pool me store karta
        // hai.
        // So both a and b point to same memory address.
        StringBuilder a = new StringBuilder("ram");
        StringBuilder b = new StringBuilder("ram");
        System.out.println(a == b);

        String c = new String("mohit");
        String d = new String("mohit");
        System.out.println(c == d); // false
        // Yahan new String() JVM ko bol raha hai: “Bhai mujhe naya object chahiye chahe
        // value same ho.”
        // So a and b point to different memory locations.

        // 2. Using .equals() → (Content Comparison)
        String h = new String("java");
        String g = new String("java");

        System.out.println(h.equals(g)); // ✅ true
        // Yahan character-by-character comparison hota hai.

        // Chahe memory location alag ho, agar content same hai → true milega.
        String z = "abc";
        String x = "abd";

        System.out.println(z.compareTo(x)); // -1 (lexicographically a < b)

        // String literal: Same value → same memory (reference equal).
        // new keyword: Same value → different memory (reference not equal).
        // Content compare karne ke liye hamesha .equals() use karo.

    }

}
