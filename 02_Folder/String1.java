import java.util.*;

// Java Strings are immutable for security, optimization, and thread safety. Changes create new objects, not modify existing ones
public class String1 {
    public static void main(String[] args) {
        // Immutable
        String[] username = { "bhai", "college" };
        String username2 = "bhai";
        System.out.println(username2);
        System.out.println(Arrays.toString(username));
        username2 = username2 + "mohit";
        System.out.println(username2);

        // /❗ Important Note:
        String user = "java";
        user = user.concat("mohit");
        System.out.println(user);
        // concat() also doesn't change original string.until tum use store na kar lo
        // Tu agar return value ko store nahi karega toh string same hi rahegi.

        // What if I want to change string?
        // Use StringBuilder ya StringBuffer 
        StringBuilder mnc = new StringBuilder("google");
        mnc.append(" Java");
        System.out.println(mnc);

    }

}