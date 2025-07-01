// polymorphism 
// Many forms of same method
// 2 types:

// Compile-time: Method Overloading

// Run-time: Method Overriding



// 1. Method Overloading (📦 Compile-Time Polymorphism)
// Same method name, but different parameters (type, number, order)
// ➤ Within the same class
// Compile-time pe decide hota hai kaunsa method chalega
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

//  2. Method Overriding (🧬 Run-Time Polymorphism)
// Child class redefines the method of parent class
// ➤ Different class, same method name + same parameters

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

// Run-time pe decide hota hai kaunsa version chalega (dynamic dispatch)


public class Polymorphism {
    public static void main(String[] args) {
        // Method Overloading Example
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));

        // Method Overriding Example
        Animal myDog = new Dog();
        myDog.sound(); // Calls the overridden method in Dog class
    }
}