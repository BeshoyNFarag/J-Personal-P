/*
* Threads
Task: Create a Java program that extends Thread and prints numbers from 1 to 5.*/

class Printer extends Thread {
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }


    }


}


public class Main {
    public static void main(String[] args) {
        Thread t = new Printer();
        t.start();


    }
}