// basics class and Object declartion 
//  Class & Object
//  Explanation:
// Class: Blueprint/template hoti hai (jaise plan of a building)
// Object: Class ka real instance (jaise actual ghar)

class Student {
    String name;
    int age;

    void displayINfo() {
        System.out.println(age);
        System.out.println("Name: " + name);
    }

}
    public class oops{
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.name = "Alice";
            student1.age = 45;
            student1.displayINfo();
        }
    }
