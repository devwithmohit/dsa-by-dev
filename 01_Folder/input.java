import java.util.Scanner;

public class input {
    public static void main(String1[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inputUser.nextLine();

        System.out.print("Enter your age: ");
        int age = inputUser.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println(inputUser);
    }
}