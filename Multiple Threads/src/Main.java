/*
* Multiple Threads
Task: Create two threads that print their names five times each.*/

class FirstThread extends Thread {
    public void run(){
        for(int i = 0 ; i < 5; i++) {
            System.out.println("First thread");
        }
    }


}


class SecondThread extends Thread{
    public void run(){
        for(int i = 0 ; i < 5; i++) {
            System.out.println("Second thread");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new FirstThread();
        Thread t2 = new SecondThread();

        t1.start();
        t2.start();

    }
}