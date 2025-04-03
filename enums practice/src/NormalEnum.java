/*
* Define an enum Planet with properties like mass and radius, then calculate weight on different planets.
*
* */


enum Planet {

    EARTH(9.81),
    MOON(1.62),
    VENUS( 8.87),
    MARS(3.71),
    JUPITER( 24.79),
    SATURN(10.44);

    private final double gravity;
    Planet(double gravity){
        this.gravity =  gravity;
    }

    public void getWeight( double mass){
        System.out.println("the weigh is " + (gravity * mass ));
    }

}


public class NormalEnum {
    public static void main(String[] args) {

        Planet planet = Planet.EARTH;
        planet.getWeight(62);


    }
}