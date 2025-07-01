public class data {
    public static void main(String1[] args) {
        // Primitive Data Types - Java ke language ke core part hain. Inka size fix hota hai aur ye directly memory me store hote hain.
        int number = 10; // Integer type
        float b = 5.5f; // Floating point type
        char c = 'A'; // Character type
        boolean d = true; // Boolean type

        int g = number; // Copy by value (primitive)
        g = 4567;
        System.out.println(number); // Output: 10
        System.out.println(g); // Output: 4567

        // Non-Primitive Data Types - objects hote hain, heap memory me store hote hain, aur unke methods/properties hote hain.
        String example = "HellJava!"; // String type
        int[] f = { 1, 2, 3 }; // Array type

        String lang = example; // Copy by reference (Strings are immutable)
        lang = "python";
        System.out.println(example); // Output: Hello, Java!
        System.out.println(lang); // Output: Python

        int[] h = f; // Copy by reference (arrays are mutable)
        h[1] = 2638;
        System.out.println(f[1]); // Output: 2638

        // Output the values
        System.out.println("Integer: " + number);
        System.out.println("Float: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + example);
        System.out.println("Array: " + java.util.Arrays.toString(f));
    }
}

// Immutable: Primitive types, String, Wrapper classes
// Mutable: Arrays, Collections, Custom objects (agar fields mutable hain)


// Primitive types (int, float, char, boolean) value copy hoti hai, reference nahi.
// Non-primitive types (String, array) reference copy hota hai, isliye array me change dono jagah reflect hota hai.
// Output statements se har variable ka value print hota hai.

// Stack me primitive values aur reference variables store hote hain.
// Heap me actual objects (arrays, Strings, custom objects) store hote hain.
// Stack fast hota hai, heap flexible aur bada hota hai.