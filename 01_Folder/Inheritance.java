class Animal {
    String name = "Dinosaur";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
        System.out.println("Name: " + name);

        sound();
    }

}
// Java me koi bhi method call sirf kisi method ke andar hi likha ja sakta hai. Tumne sound(); ko method ke bahar likh diya hai (Dog class ke andar but kisi method ke andar nahi), isiliye Java complain kar raha hai.


public class Inheritance {
    public static void main(String1[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sound(); // Calling the inherited method from Animal class
    }
}