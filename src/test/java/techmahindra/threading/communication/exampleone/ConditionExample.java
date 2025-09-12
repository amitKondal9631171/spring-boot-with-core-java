package techmahindra.threading.communication.exampleone;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBuffer {

    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    /**
     * Why Two Conditions?
         * We separate them because
         * Producers need to know when the buffer has space (notFull).
         * Consumers need to know when there is data available (notEmpty).
         * If we used one condition for both, signaling would wake up threads unnecessarily, leading to inefficiency or even missed signals.
     */

    public void produce(int value) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full. Producer is waiting...");
                notFull.await();  // like wait()
            }
            buffer.add(value);
            System.out.println("Produced: " + value);
            notEmpty.signal();  // like notify()
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty. Consumer is waiting...");
                notEmpty.await();  // like wait()
            }
            int value = buffer.poll();
            System.out.println("Consumed: " + value);
            notFull.signal();  // like notify()
        } finally {
            lock.unlock();
        }
    }
}

public class ConditionExample {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();

        // Producer Thread
        Thread producer = new Thread(() -> {
            int value = 1;
            while (true) {
                try {
                    sharedBuffer.produce(value++);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    sharedBuffer.consume();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
