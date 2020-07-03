package multithreading.reentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runner {

    private int count=0;

    private Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();

    private void increment(){
        for(int i=0;i<10000;i++){
            count++;
        }
    }

    public void firstThread() throws InterruptedException {

        lock.lock();
        System.out.println("waiting for the second thread to notify ");
        cond.await();

        System.out.println("woken up ");

        try {
            increment();
        }
        finally {
            lock.unlock();
        }

    }

    public void secondThread() throws InterruptedException {

        Thread.sleep(3000);
        lock.lock();

        System.out.println("enter the next line ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("got the next line ");

        cond.signal();

        try {
            increment();
        }
        finally {
            lock.unlock();
        }
    }

    public void finished(){
            System.out.println("count"+count);
    }

}

public class App {

    public static void main(String[] args) throws InterruptedException {
        Runner runner= new Runner();
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        runner.finished();
    }

}
