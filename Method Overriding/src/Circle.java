/*
* 4. Method Overriding
Task: Create a Shape class with a method area().

Create two subclasses Circle and Rectangle.

Override area() in both subclasses to return the correct area calculations.

Demonstrate method overriding by creating objects of both subclasses and calling area().*/



public class Circle extends Shape{
    public int area(int n){
        return(int) (3.1416 * Math.pow(n, 2))  ;
    }
}
