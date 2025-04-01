/*
* Runnable Interface
Task: Implement a Runnable that prints "Hello from Runnable!" five times and run it using a Thread object.*/


class First implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Hello from Runnable");
        }
    }


}

public class Main {
    public static void main(String[] args) {
        Runnable r = new First();
        Thread t = new Thread(r);
        t.start();


    }
}