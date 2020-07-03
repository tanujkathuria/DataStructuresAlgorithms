package multithreading.basic;

import java.util.Scanner;

class Processor extends Thread {

    private volatile boolean running = true;


    public void run(){

        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown(){
        running = false;
    }
}

public class ThreadSynchronization {

    public static void main(String[] args) {


        Processor processor= new Processor();
        processor.start();

        System.out.print("press enter to shutdown");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        processor.shutDown();

    }
}
