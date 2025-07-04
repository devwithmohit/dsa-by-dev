// ☑️ Check whether one string is a rotation of another
// Kyuki jab tu ek string ko 2 baar jodta hai, toh usme rotation ke liye circularity create ho jaati hai	
public class Question2 {
    public static void main(String[] args) {
        String s1 = "mohit";
        String s2 = "hitmo";
        // String s2 = "hito"; //for no rotation exist
        if (isrotation(s1, s2)) {
            System.out.println("yes rotation exist");
        } else {
            System.out.println("no rotation exist");
        }

    }

    static boolean isrotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String s1s1 = s1 + s1;
        System.out.println(s1s1);
        return s1s1.contains(s2);

    }

}

// ❓ Suppose: s2 = "cdab"
// Is "cdab" any rotation of "abcd"?

// 🔑 Trick:
// Agar tu s1 + s1 karega:

// java
// Copy
// Edit
// s1 + s1 = "abcdabcd"
// So s1 + s1 me saare rotation patterns included honge:

// s1 = "abcd"
// All possible rotations of s1:
// → "abcd" (0 rotation)
// → "bcda" (1 left rotation)
// → "cdab" (2 rotations)
// → "dabc" (3 rotations)
