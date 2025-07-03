public class String10 {
    public static void main(String[] args) {
        // StringBuilder
        // Java ka class jo mutable string handle karta hai.
        // Matlab: You can change the content without creating a new object.
        StringBuilder username = new StringBuilder("Code");
        username.append("WithMe"); // CodeWithMe
        username.insert(4, "123"); // Code123WithMe
        username.delete(4, 7); // CodeWithMe
        username.reverse(); // eMhTih edoC
        System.out.println(username);
    }

}
