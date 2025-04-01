/*
* Thread Sleep
Task: Create a thread that prints numbers from 1 to 5 with a 1-second delay between prints using*/

class First extends Thread {
    public void run() {

        for(int i = 0 ; i <= 5 ; i ++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
                System.out.println("one second delay worked");
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }


}

public class Main {
    public static void main(String[] args) {

        Thread t = new First();
        t.start();


    }
}