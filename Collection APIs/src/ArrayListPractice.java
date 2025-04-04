/*
*  ArrayList - Reverse List
Write a program that accepts a list of numbers from the user
* and prints the list in reverse order using an ArrayList.

Input: [10, 20, 30, 40, 50]

Output: [50, 40, 30, 20, 10])*/

import java.util.*;


public class ArrayListPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int arrSize = scanner.nextInt();

        for(int i = 0; i < arrSize; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.println(nums.reversed());



        scanner.close();



    }
}