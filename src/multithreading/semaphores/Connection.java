package multithreading.semaphores;

import java.util.concurrent.Semaphore;

public class Connection {

    private int connections = 0 ;

    private static Connection instance = new Connection();

    private Semaphore semaphore= new Semaphore(10);

    private Connection(){

    }

    public static Connection getInstance(){
        return instance;
    }

    public void connect() throws InterruptedException {

        semaphore.acquire();
        synchronized (this){
            connections++;
            System.out.println("current connection"+ connections);
        }

        Thread.sleep(2000);

        synchronized (this){
            connections -- ;
        }
        semaphore.release();
    }
}
