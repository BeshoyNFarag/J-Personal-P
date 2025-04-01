/*2. Generic Method to Find the Maximum in an Array
Task: Write a generic method findMax(T[] array) that returns the maximum
element from an array of Comparable elements.

The method should work for Integer, Double, String, etc.

Test it with an Integer array and a String array.*/


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


class Max <T>{
    public <T> void findMax(T [] array){

        Iterator <T> it = Arrays.stream(array).iterator();
        T max = null;
        while(it.hasNext()){
            T var = it.next();
            T compare = it.next();

            if (var.toString().compareTo(compare.toString()) > 0  ){
                max = var;
            }
            else if (var.toString().compareTo(compare.toString()) < 0){
                max = compare;
            }

        }
        System.out.println(max);



    }

}

public class Practice2 {

    public static void main(String[] args) {

        Max<Double> find = new Max<>();
        Integer [] array = {1,2,3,4};
        find.findMax(array);


    }
}
