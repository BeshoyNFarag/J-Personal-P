/*
*
* 3. this and super Methods
Task: Create a Car class with attributes brand and speed.

Use this to differentiate constructor parameters from instance variables.

Create a subclass SportsCar that extends Car and adds an attribute turboSpeed.

Use super in SportsCar to call the constructor of Car.

Create objects and display all attributes using methods.
* */



public class SportsCar extends Car{
    protected double turboSpeed;

    public SportsCar(){

        System.out.println("Inside SportsCar");
    }
     public SportsCar(String brand,double speed ,double turboSpeed) {
         super(brand, speed);


        this.turboSpeed = turboSpeed;
        System.out.println("SportsCar paramitarized Constructor");
    }
}
