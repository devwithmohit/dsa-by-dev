abstract class Vehicle {
    abstract void start();
    abstract void stop();
}
class  Car extends Vehicle{
    void start(){
        System.out.println("Car is starting");
    }
    void stop(){
        System.out.println("Car is stopping");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike is starting");
    }
    void stop(){
        System.out.println("Bike is stopping");
    }
}
public class Abstraction {
    public static void main(String1[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}