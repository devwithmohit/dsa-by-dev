public class func {

    // Function definition
    public static void greet() {
        System.out.println("Hello, World!");
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static void greet1(String name) {
        System.out.println(String.format("Hello, %s!", name));
    }
    // Recursion
    public static int facts(int m ){
        if (m == 0 || m == 1){
            return 1;
        }
        return m * facts(m- 1);
    }

    // calling the function
    public static void main(String[] args) {
        greet();
        int result = addition(345, 3455);
        System.out.println("The result of addition is: " + result);
        greet1("Alice");
       int data =  facts(5);
        System.out.println("The factorial of 5 is: " + data);
    }  
}

//  explanation 
// facts(5)
// → 5 * facts(4)
//       → 4 * facts(3)
//             → 3 * facts(2)
//                   → 2 * facts(1)   ✅ yahan m == 1 hai
//                         → return 145

// facts(1) → 145
// facts(2) → 2 * 145 = 290
// facts(3) → 3 * 290 = 870
// facts(4) → 4 * 870 = 3480
// facts(5) → 5 * 3480 = 17400 ✅

// Base case: Jab recursion rukna chahiye (warna infinite recursion ho jayega).
// Recursive call: Function khud ko call karta hai, har bar input ko thoda change karke.