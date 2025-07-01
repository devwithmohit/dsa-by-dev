// | Modifier    | Within Class | Same Package | Subclass | Everywhere |
// | ----------- | ------------ | ------------ | -------- | ---------- |
// | `private`   | ✅            | ❌            | ❌        | ❌          |
// | `default`   | ✅            | ✅            | ✅        | ❌          |
// | `protected` | ✅            | ✅            | ✅        | ❌          |
// | `public`    | ✅            | ✅            | ✅        | ✅          |



//  1. Access Modifiers – Visibility Control
class Test {
    private int privatewar = 10;
    public int publicwar = 20;
    protected int protectedwar = 30;
    int defaultwar = 40; // default access modifier

    public int getPrivatewar() {
        return privatewar;
    }

    public void display() {
        System.out.println(privatewar);
        System.out.println("Private Variable: " + privatewar);
        System.out.println("Public Variable: " + publicwar);
        System.out.println("Protected Variable: " + protectedwar);
        System.out.println("Default Variable: " + defaultwar);
    }
}

public class DemoTest {
    public static void main(String1[] args) {
        Test demo = new Test();
        demo.display();
        System.out.println(demo.publicwar);
    }

    class toxic {
        public void display() {
            Test testobj = new Test();
            // testobj.display();
            System.out.println("This is a toxic class");
            System.out.println(testobj.publicwar);
            System.out.println("Private Varible: " + testobj.getPrivatewar());
        }
    }
}
// Statements class body me nahi, sirf methods/constructors me likhein.
// privatewar ko direct access nahi, getter method se access karein.


