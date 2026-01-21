package techmahindra.threading;

import java.util.concurrent.atomic.AtomicInteger;

class ReorderingExample {
    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 42;        // Step 1
        flag = true;   // Step 2
    }

    public void reader() {
        /*try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println(flag);
    }

    public static void main(String[] args) {

            ReorderingExample example = new ReorderingExample();
            Thread t1 = new Thread(example::writer, "Writer Thread");
            Thread t2 = new Thread(example::reader, "Reader Thread");

            t2.start();
            t1.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}
