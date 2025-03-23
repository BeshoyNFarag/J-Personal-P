import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

class Main{
    public static void main(String [] args){


        ArrayList<Integer> list =  new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int num = 0;



        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        for(int i = 0 ; i < num ; i++ ){
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        it = list.iterator();
        while(it.hasNext()){
            int value = it.next();
            if(value % 3 == 0 || value == 1){
                it.remove();
            }

        }
        it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }




    }
}

