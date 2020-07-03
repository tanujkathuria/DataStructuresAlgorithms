package multithreading.callable;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
       Future<Integer> future =  executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random= new Random();
                int duration = random.nextInt(4000);
               /* if(duration > 2000){
                    throw new IOException("SLEEPING FOR TOO LONG");
                }*/
                System.out.println("starting call method");
                Thread.sleep(duration);
                System.out.println("ending call method");
                return duration;
            }
        });
        executorService.shutdown();

        System.out.println("result is "+ future.get());

    }

}

