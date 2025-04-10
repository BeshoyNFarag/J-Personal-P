/*
* ✅ Task 1: Print All Items in a List
🔹Goal:
Use forEach to print every element in a list of strings.

📌 Instructions:
Create a List<String> with names of your favorite fruits.

Use forEach to print each fruit on a new line.
*
* */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;


public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Collection <String> myList = new ArrayList<>();
        int inputNum = scanner.nextInt();
        scanner.nextLine();

        while(inputNum > 0 ){
            myList.add(scanner.nextLine());
            inputNum--;
        }
        // some data manipulaiton the lambda expression and the for each method
        //is still working the same
        // using for each and lambda
        myList.forEach(n-> System.out.println(n.substring(0, n.length()-3)));

        System.out.println();
        // using for each method and passing an objecct of Consumer class

        Consumer<String> consum = new Consumer<>() {
            public void accept(String str){
                System.out.println(str);
            }

        };

        myList.forEach(consum);

    }
}