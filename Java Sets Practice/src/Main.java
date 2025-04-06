/*
Task 1: HashSet – Unique Words Collector
Goal: Read a list of words (can be hardcoded or from user input) and use
a HashSet to store only unique words. Then, display how many unique words there are.*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> userInput = new HashSet<>();
        String userContinue;
        boolean userFinished = false;
        int count = 0;

        while(!userFinished) {
            System.out.print("Please enter the input that you want: ");
            userInput.add(scanner.nextLine());
            System.out.print("press y or Y if you are finished: ");
            userContinue = scanner.nextLine();

            if(userContinue.equalsIgnoreCase("Y")) {
                userFinished = true;
            }
            else {
                userFinished = false;
            }
        }

        System.out.println(userInput.size());






    }
}