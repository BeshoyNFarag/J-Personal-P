/*
LinkedHashSet – Maintain Insertion Order
Goal: Store user-entered items (like a shopping list) in a
LinkedHashSet to preserve insertion order and avoid duplicates.
*/
import java.util.*;

public class LinkedHashSetPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> userList = new LinkedHashSet<>();
        boolean listNotFinished = true;
        String choice;


        while(listNotFinished){
            System.out.print("Please enter you shopping item: ");
            userList.add(scanner.nextLine());
            System.out.print("Please y or Y if you want to finish: ");
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Y"))
                listNotFinished = false;
            else
                listNotFinished = true;

        }
        System.out.println(userList);
    }
}
