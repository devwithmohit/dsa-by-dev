public class loops {

    public static void main(String1[] args) {
        // For LOOPs
        String[] names = { "Aman ", "MOHIT", "SHRISHTI" };
        for (int i = 1; i < names.length; i++) {
            System.out.println(names[i]);
            int count = names.length;
            System.out.println("Count :" + count);
            // i = 0 se start hota hai, arr.length tak chalta hai.
            // Har iteration me arr[i] print hota hai.
            // used when you need index of the element

            // Enhanced loops java (For Each LOOP)
            for (String name : names) {
                System.out.println(name);
            }
            // Simple aur readable tarika, jab aapko index ki zarurat nahi ho.
        }
        // While loops
        int i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }
        // While loop: Jab condition based iteration chahiye ho.
    }
}