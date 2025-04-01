/*
* 1. Generic Class for a Pair of Values
Task: Create a generic class Pair<T, U> that stores two values of different types.

Implement a constructor, getters, and a toString() method.

Create a Pair<Integer, String> and Pair<Double, Boolean> in main() and print their values.*/


class Pair <T, U>{
    T first;
    U second;

    public Pair(){

    }

    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }

    public String toString(T first){
        return first.toString();
    }

}
public class Practice1 {

    public static void main(String[] args) {
        Pair <Integer, String> firstPair = new Pair<>();
        firstPair.setFirst(22);
        firstPair.setSecond("Beshoy");
        System.out.println(firstPair.getFirst());
        System.out.println(firstPair.getSecond());
        System.out.println(firstPair.toString(22));

        Pair <Double, Boolean> pair2 = new Pair<>();
        pair2.setFirst(150.232);
        pair2.setSecond(true);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair2.toString(150.232));

    }
}