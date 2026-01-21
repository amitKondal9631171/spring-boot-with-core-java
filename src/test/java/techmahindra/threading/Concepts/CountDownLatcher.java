package techmahindra.threading.Concepts;

import java.util.concurrent.CountDownLatch;

/**
 * Created by user on 8/8/2020.
 */
public class CountDownLatcher {

    /**
     * It is used to block the thread till the count given becomes zero.
     *  Thread on which latch is used by using await method then thread will wait till this count becomes zero by other threads.
     *
     */
    protected static CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) {

        Waiter      waiter      = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter)     .start();
        new Thread(decrementer).start();

        //Thread.sleep(4000);

    }
}

class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
            Thread.sleep(1000);
            this.latch.countDown();

            Thread.sleep(1000);
            this.latch.countDown();

            Thread.sleep(1000);
            this.latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println("Going to Latch");
            latch.await();
            System.out.println("Latch count becomes 0 to wait is over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}