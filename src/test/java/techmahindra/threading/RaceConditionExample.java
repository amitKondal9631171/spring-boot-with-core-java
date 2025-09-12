package techmahindra.threading;

class Counter {
    int count = 0;
      void increment() {
        count++;
    }
}

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {

                //counter.count++; // Not thread-safe
                counter.increment();
                // Thread.yield();  // Force thread interleaving, this is added because test isn’t creating enough thread contention for the race condition to appear.
                /**
                 * Why you're always seeing 2000
                 *
                 * Low Thread Count
                 *  With just 2 threads, and a very small workload (1000 increments each), the probability of a conflicting update is low.
                 *  Fast CPU / JIT Optimizations
                 *  Modern CPUs and the JVM JIT compiler are very fast. The threads might be running almost sequentially instead of truly in parallel.
                 *  No artificial delay
                 *  Without adding a Thread.yield() or Thread.sleep() in the loop, you’re not forcing interleaving of thread execution.
                 *
                 * How It Works
                 *      When a thread calls yield(), it moves from the RUNNING state back to RUNNABLE.
                 *      The thread scheduler may then pick another thread of the same priority to run.
                 *      If no other thread is ready, the same thread may continue running.
                 * yield() was used to implement cooperative multitasking, where threads voluntarily let others run.
                 */
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}