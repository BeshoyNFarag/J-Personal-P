/*
*
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


public class Car {
    static class Engine{
        public void run(){
            System.out.println("Engine is running for " + model);
        }

    }


    static String model;


    public Car(String model){
        this.model = model;
    }

    public void startEngine(){
        Engine engine = new Engine();
        engine.run();
    }
}
