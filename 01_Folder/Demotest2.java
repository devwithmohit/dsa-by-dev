// static keyword kisi variable, method, ya block ko class-level bana deta hai.
// Use:
// Class ke bina object banaye access kar sakte hain.
// Sabhi objects ke liye ek hi copy hoti hai.

class Demo {
    static int count = 0;

    static void show() {
        // count++;
        System.out.println("Static variable");
    }
}
// Java me code execution hamesha main() method se start hota hai.
// Toh Demo.show(); sirf kisi method ke andar (like main) likhna chahiye.
public class Demotest2 {
    public static void main(String1[] args) {

        Demo.show();
    }
}


