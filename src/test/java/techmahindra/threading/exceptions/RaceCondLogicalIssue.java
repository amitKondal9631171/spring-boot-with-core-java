package techmahindra.threading.exceptions;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    Lock lock = new ReentrantLock();
    private final AtomicInteger counter = new AtomicInteger(0);
    int count = 0;
    void increment()
    {
        count++;
    }

    public void handlingWithAtomicClass(){
         count = counter.incrementAndGet(); // atomically increments and returns updated value
        System.out.println(Thread.currentThread().getName() + " incremented count to " + count);

    }
    public int getCount() {
        return counter.get();
    }
    public void handlingWithLock() {
        try {
            // Try to acquire the lock with timeout to avoid deadlock
            if (lock.tryLock(1, TimeUnit.SECONDS)) { //try to get lock in 1 second
                try {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
                } finally {
                    lock.unlock(); // Always release lock in finally
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " couldn't acquire lock - skipping increment");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

}

public class RaceCondLogicalIssue {

    public static void main(String[] args) {
        Counter counterT = new Counter();
        ExecutorService exec = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 1000; i++)
            exec.submit(counterT::handlingWithAtomicClass);

        exec.shutdown();

    }
}
