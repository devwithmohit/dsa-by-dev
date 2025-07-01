// finaltestnal kisi variable, method, ya class ko change hone se rokta hai.
// Use:
// Variable: Value ek baar assign hone ke baad change nahi hoti (constant).
// Method: Method ko override nahi kiya ja sakta.
// Class: Class ko inherit nahi kiya ja sakta
// final int x = 10; // x ki value ab change nahi ho sakti

final class Animal {
} // Is class ko extend nahi kar sakte

class Dog {
    final void bark() {
        System.out.println("Bark");
    }
    // bark() ko override nahi kar sakte
}

public class finaltest {
    static final int x = 10;

    public static void main(String[] args) {
        System.out.println("Final keyword example:" + x);

        Animal animal = new Animal(); // Animal class ka object
        Dog dog = new Dog(); // Dog class ka object
        dog.bark(); // Dog ki bark method call hoti hai
        System.out.println(animal);
    }
}