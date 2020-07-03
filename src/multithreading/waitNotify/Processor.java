package multithreading.waitNotify;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("producer thread running ");
            wait();
            System.out.println("producer thread notified  ");

        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(3000);
        Scanner sc = new Scanner(System.in);


        synchronized (this){
            System.out.println("waiting for return key ");
            sc.nextLine();
            System.out.println("return key pressed ");
            notify();



        }
    }
}
