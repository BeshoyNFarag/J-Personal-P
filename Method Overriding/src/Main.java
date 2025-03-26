/*
* 4. Method Overriding
Task: Create a Shape class with a method area().

Create two subclasses Circle and Rectangle.

Override area() in both subclasses to return the correct area calculations.

Demonstrate method overriding by creating objects of both subclasses and calling area().*/


public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();


        System.out.println(shape.area(4));
        System.out.println(circle.area(4));
        System.out.println(rectangle.area(4, 5));

    }
}