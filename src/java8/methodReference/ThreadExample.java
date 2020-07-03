package java8.methodReference;

public class ThreadExample {


    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println(" method reference CHILD THREAD ");
        }
    }
    public static void main(String[] args) throws InterruptedException {

        ThreadExample threadExample= new ThreadExample();
        // i csn use method reference also
        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("CHILD THREAD ");
            }
        };

        Runnable r1 = threadExample::m1;

        Thread t = new Thread(r);
        Thread t1  = new Thread(r1);
        t.sleep(100);
        t.start();
        t1.start();
    }
}
