package techmahindra.threading.Concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

public class LockImplementation {

/**
 * A Lock is, however, more flexible and more sophisticated than a synchronized block.
 * First a Lock is created. Then it's lock() method is called.
 * Now the Lock instance is locked.
 * Any other thread calling lock() will be blocked until the thread that locked the lock calls unlock().
 * Finally unlock() is called, and the Lock is now unlocked so other threads can lock it.
 * A synchronized block makes no guarantees about the sequence in which threads waiting to entering it are granted access.
 *  You cannot pass any parameters to the entry of a synchronized block.
 * Thus, having a timeout trying to get access to a synchronized block is not possible.
 * The synchronized block must be fully contained within a single method.
 * A Lock can have it's calls to lock() and unlock() in separate methods.
 * Lock Methods
     The Lock interface has the following primary methods:

    lock(): locks the lock instance. If already locked the takes thread to the blocked state
    lockInterruptibly(): If acquires the lock then only
    tryLock(): try to aquire the lock if got the lock then returns true else false. In this case thread never blocks.
    tryLock(long timeout, TimeUnit timeUnit)
    unlock()
 */


    private static Runnable r1 = () -> {
                                            System.out.println("Runnable r1");
                                            threadResource("Runnable Implementation thread");
                                        };
    private static Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread declared");
            threadResource("Thread Implementation thread");
        }
    });

    private static void threadResource(String threadName){

        Lock lock = new ReentrantLock();
        lock.lock();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Inside the resource using by thread "+threadName);
        lock.unlock();
    }

    private static void readWriteLock(){
        //Multiple threads can read from a shared resource without causing concurrency errors.
        //ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        //readWriteLock.readLock().lock();
        /**
         * Read Lock: If no threads have locked the ReadWriteLock for writing,
                         and no thread have requested a write lock (but not yet obtained it).
                         Thus, multiple threads can lock the lock for reading.
         Write Lock: If no threads are reading or writing.
                        Thus, only one thread at a time can lock the lock for writing.
         */
        ExecutorService service = Executors.newFixedThreadPool(10);
        ReadWriteLock rw1 = new ReentrantReadWriteLock();
        service.submit( ()-> {
            try {
                rw1.writeLock().lock();
                return "Task submitted to service as anonymous class";
            }finally {
                //we only way to write statement after return is to write code in finally block
                rw1.writeLock().unlock();
            }
        } );
    }

    private void stampedLocking(){

        /**
         * https://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/
         * StampedLock return a stamp represented by a long value.
         * You can use these stamps to either release a lock or to check if the lock is still valid.
         * Additionally stamped locks supports optimistic locking.
         * ReadWriteLock read tasks have to wait until the write lock has been released.
         * An optimistic read lock is acquired by calling tryOptimisticRead() which
         *  always returns a stamp without blocking the current thread, no matter if the lock is actually available.
         */
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put("foo", "bar");
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        Runnable readTask = () -> {
            long stamp = lock.readLock();
            try {
                System.out.println(map.get("foo"));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                lock.unlockRead(stamp);
            }
        };
    }

    private static void stampedLock(){

        StampedLock lock = new StampedLock();

        long lockStamp = lock.readLock();

        lock.unlockRead(lockStamp);
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(r1);
        t1.start();t2.start();


    }
}
