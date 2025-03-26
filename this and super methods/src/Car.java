/*
*
* 3. this and super Methods
Task: Create a Car class with attributes brand and speed.

Use this to differentiate constructor parameters from instance variables.

Create a subclass SportsCar that extends Car and adds an attribute turboSpeed.

Use super in SportsCar to call the constructor of Car.

Create objects and display all attributes using methods.
* */



public class Car {
    protected String brand;
    protected double speed;

    public Car() {
        System.out.println("Car Constructor");
    }
    public Car(String brand, double speed){
        this();
        this.brand = brand;
        this.speed = speed;
        System.out.println("Car Paramiteraized Constructor");

    }
}
