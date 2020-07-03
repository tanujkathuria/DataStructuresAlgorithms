package multithreading.basic;

class Runner2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("hello"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread2  {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner2());
        t1.start();
        Thread t2 = new Thread(new Runner2());
        t2.start();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("me too executing");
            }
        });
        t3.start();
    }

}
