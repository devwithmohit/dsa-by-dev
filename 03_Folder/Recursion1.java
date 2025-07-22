
// Jab ek function khud ko call karta hai, toh usse recursion kehte hain.
// Ek base case hota hai (jisme rukna hota hai), aur ek recursive call hota hai
// (jisme kaam repeat hota hai).
public class Recursion1 {

    public static int factorial(int n) {
        // base call
        if (n == 0 || n == 1) {

            return 1;
        }
        // recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int data = factorial(4);
        System.out.println(data);
    }
}