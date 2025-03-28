/*
Task 3: Inner Class
Create a car system with an inner class.

Create a class Car with:

A field String model

A constructor to initialize model

A method startEngine() that creates an instance of an inner class Engine and calls its method

Inside Car, create an inner class Engine that:

Has a method run() printing "Engine is running for [model]"

In main(), create a Car object and call startEngine().

*/

public class Main {
    public static void main(String[] args) {

        Car car = new Car("ferrari");
        Car.Engine engine = new Car.Engine();
        engine.run();

    }
}