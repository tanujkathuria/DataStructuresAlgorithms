package multithreading.ProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consume();
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

    private static  void produce() throws InterruptedException {
        Random random = new Random();
        while(true){
            queue.put(random.nextInt(100));
        }
    }

    private static void consume() throws InterruptedException {
        Random random = new Random();
        while(true){
            Thread.sleep(100);
            if(random.nextInt(10) == 0 ){
                Integer value =queue.take();
                System.out.println("taken value"+value+" queue size "+queue.size());
            }
        }
    }
}
