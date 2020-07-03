package multithreading.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable{
    private int id;

    Processor(int id){
        this.id = id;
    }

    public void run()
    {
        System.out.println("starting "+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ending "+id);
    }
}

public class App {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            executorService.submit(new Processor(i));
        }
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executorService2.submit(new Processor(i));
        }
    }

}
