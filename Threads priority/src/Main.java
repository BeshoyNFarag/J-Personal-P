/*
* Thread Priority
Task: Create three threads with different priorities
*  (MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY) and observe execution order.

*/

class First extends Thread {
    public void run(){

        for (int i = 0 ; i < 20; i++){
            System.out.println("First thread");
            System.out.println(Thread.currentThread().getPriority());
        }

    }


}
class Second extends Thread {
    public void run(){

        for (int i = 0 ; i < 20; i++){
            System.out.println("Second thread");
            System.out.println(Thread.currentThread().getPriority());
        }

    }
}
class Third extends Thread {
    public void run(){

        for (int i = 0 ; i < 20; i++){
            System.out.println("Third thread");
            System.out.println(Thread.currentThread().getPriority());
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new First();
        Thread t2 = new Second();
        Thread t3 = new Third();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();



    }
}