/*
*Instead of interfaces, let's use a base class (LivingBeing) and demonstrate multiple inheritance using an intermediate
* class (Animal) and a final class (Bird).

Instructions:
Create a LivingBeing class with a method breathe().

Create an Animal class that extends LivingBeing and adds a method walk().

Create a Bird class that extends Animal and adds a method chirp().

In the Main class, create an instance of Bird and call all three methods (breathe(), walk(), and chirp()).*/

class Main{
    public static void main(String [] args){
        LivingBeing livingBeing = new LivingBeing();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();

        livingBeing.breathe();
        bird.breathe();
        mammal.breathe();


        System.out.println();
        bird.fly();
        mammal.walk();




    }
}