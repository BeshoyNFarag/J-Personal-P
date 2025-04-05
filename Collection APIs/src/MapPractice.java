/* Beginner HashMap Task: "Student Grades Lookup"
Description: Create a simple Java program that uses a HashMap to store student
names and their grades. Then let the user look up a student's grade by entering their name.*/

import java.util.Scanner;
import java.util.HashMap;

public class MapPractice {
    public static void main(String [] args){

        HashMap<String, Integer> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean finishedInput = true;
        boolean takingOutput = true;
        String chooseStatus;
        String key;
        String lookupKey;
        int value;


        while(finishedInput == true){

            System.out.print("please enter the key: ");

            key = scanner.nextLine();
            System.out.print("please enter the value: ");
            value = scanner.nextInt();
            students.put(key, value);
            System.out.println("press y or Y if you want to continue: ");
            scanner.nextLine();
            chooseStatus = scanner.nextLine();
            if(chooseStatus.equals("Y") || chooseStatus.equals("y")){
                finishedInput = true;
            }
            else
                finishedInput = false;


        }

        while(takingOutput ){
            System.out.print("please enter the name you want to look up: ");
            lookupKey = scanner.nextLine();
            lookupKey = lookupKey.substring(0,1).toUpperCase() + lookupKey.substring(1);
            System.out.println(students.get(lookupKey));

            System.out.println("press y or Y if you want to continue: ");
            chooseStatus = scanner.nextLine();
            if(chooseStatus.equals("Y") || chooseStatus.equals("y")){
                takingOutput = true;
            }
            else takingOutput = false;

        }





    }
}
