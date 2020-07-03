package multithreading.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws InterruptedException {


        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i =0;i<200;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Connection.getInstance().connect();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
