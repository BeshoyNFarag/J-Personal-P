/*
*
* 3. this and super Methods
Task: Create a Car class with attributes brand and speed.

Use this to differentiate constructor parameters from instance variables.

Create a subclass SportsCar that extends Car and adds an attribute turboSpeed.

Use super in SportsCar to call the constructor of Car.

Create objects and display all attributes using methods.
* */




public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("ferrari", 120, 150);

    }
}