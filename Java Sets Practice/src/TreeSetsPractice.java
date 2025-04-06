/*
TreeSet – Sorted Number Set
Goal: Accept a list of integers and use a TreeSet to automatically
sort and store them. Then, display the sorted numbers.
*/

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetsPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> userNumbers = new TreeSet<>();
        boolean userInputing = true;
        String choice;

        while(userInputing){

            System.out.print("Please enter a number: ");
            userNumbers.add(scanner.nextInt());
            scanner.nextLine();
            System.out.print("please press y or Y if you are finished: ");
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                userInputing = false;
            }
            else
                userInputing = true;
        }
        System.out.println(userNumbers);

    }

}
