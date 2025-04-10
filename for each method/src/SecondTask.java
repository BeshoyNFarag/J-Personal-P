/*
* Task 2: Sum All Even Numbers in a List
🔹Goal:
Use forEach to:

Go through a list of integers

Check for even numbers

Add them up and print the total

📌 Instructions:
Create a List<Integer> of numbers (e.g., 1 to 10).

Inside the forEach, check if the number is even.

Use an AtomicInteger or a wrapper variable to accumulate the sum
(because lambdas can't modify non-final variables directly).
 */

import java.util.Collection;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<Integer> myList = new ArrayList<>();
        AtomicInteger count = new AtomicInteger(0);
        Consumer <Integer> consum = new Consumer<Integer>() {
            public void accept(Integer n) {
                if(n % 2 == 0 ){
                    count.addAndGet(n);
                }

            }

        };

        int inputNumber = scanner.nextInt();

        while(inputNumber > 0){
            myList.add(scanner.nextInt());
            inputNumber--;
        }

        myList.forEach(consum);
        System.out.println(count.get());


    }
}
