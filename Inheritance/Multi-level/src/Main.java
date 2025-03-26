/*1. Multi-level Inheritance
Task: Create a class hierarchy representing Animal → Mammal → Dog.

Animal should have a method eat().

Mammal should inherit from Animal and add a method walk().

Dog should inherit from Mammal and add a method bark().

Create a Main class to test calling methods from all levels.*/






public class Main {
    public static void main(String [] args){
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();


        animal.eat();
        mammal.eat();
        dog.eat();
        System.out.println();
        mammal.walk();
        dog.walk();
        System.out.println();
        dog.bark();




    }
}
