
public class casting {
    public static void main(String[] args) {
        // 1. Type Conversion (Automatic/Widening)
        // Java khud se chhote type ko bade type mein convert kar deta hai.
        // Isko widening ya implicit casting bhi bolte hain.
        // Data loss nahi hota.
        int a = 10;
        float b = a; // int se float (automatic)
        System.out.println(b);
        // 2. Type Casting (Manual/Narrowing)
        // Jab aap bade type ko chhote type mein convert karte hain.
        // Isko narrowing ya explicit casting bolte hain.
        // Data loss ho sakta hai, isliye manually karna padta hai.
        float x = 5.7f;
        int y = (int) x; // float se int (manual casting), y = 5
        System.out.println(y);
        // String ko number mein convert karne ke liye parsing methods use hote hain,
        // jaise Integer.parseInt("123").
        // Wrapper classes bhi type conversion mein kaam aati hain.
        String s = "123";
        int num = Integer.parseInt(s); // String
        System.out.println(num);
    }
}
        