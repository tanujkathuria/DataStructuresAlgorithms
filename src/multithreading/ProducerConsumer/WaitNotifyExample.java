package multithreading.ProducerConsumer;

import java.util.LinkedList;
import java.util.Random;

class Processor{

    LinkedList<Integer> linkedList= new LinkedList<Integer>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    public void produce () throws InterruptedException {

        int value =0;

        while(true) {
            synchronized (lock) {
                while(linkedList.size() == LIMIT){
                    lock.wait();
                }
                linkedList.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        Random random= new Random();

        while(true){
            synchronized (lock) {
                while(linkedList.size() == 0){
                    wait();
                }
                System.out.println("size: " + linkedList.size());
                int value = linkedList.removeFirst();
                System.out.println(value);
                lock.notify();
            }
            Thread.sleep(random.nextInt(1000));
        }

    }
}

public class WaitNotifyExample {

    public static void main(String[] args) throws InterruptedException {

        final Processor processor= new Processor();

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
