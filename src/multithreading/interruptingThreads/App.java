package multithreading.interruptingThreads;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        System.out.println("starting ");

        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for(int i=0;i<1E8;i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("thread is interrupted");
                        break;
                    }
                    /*try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    Math.sin(random.nextDouble());
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ending ");

    }
}
