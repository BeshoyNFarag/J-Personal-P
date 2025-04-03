/**
 *
 *
 * Functional Interface: Create a functional interface for a simple
 * calculation and implement it using a lambda expression.
 */


@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}



public class Practice {
    public static void main(String[] args) {
        Calculator calc = (a, b) -> a + b;
        int result = calc.add(10, 20);
        System.out.println(result);


    }
}