/*
* Task 1: Sum of Numbers
Description:
Write a method sumNumbers that takes a variable number of integer arguments and returns their sum*/



public class Practice1 {
    public int add(int ... sum){
        int result = 0;
        for(int number : sum){

            result += number;
        }

        return result;

    }
    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        System.out.println(practice1.add(1,2,4,5,6,7));



    }
}