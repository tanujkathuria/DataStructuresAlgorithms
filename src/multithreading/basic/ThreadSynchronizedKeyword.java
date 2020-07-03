package multithreading.basic;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSynchronizedKeyword {

    AtomicInteger count = new AtomicInteger(0);


    public static void main(String[] args) {
        ThreadSynchronizedKeyword threadSynchronizedKeyword = new ThreadSynchronizedKeyword();
        threadSynchronizedKeyword.doWork();
    }

    public void doWork(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    count.getAndIncrement();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    count.getAndIncrement();
                }
            }
        });

        t1.start();
        t2.start();

        System.out.print("count is"+count);

    }
}
