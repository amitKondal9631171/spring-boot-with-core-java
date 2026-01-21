package techmahindra.threading.Concepts;


/**
 * What does interrupting a thread mean?
 *      In Java, interrupting a thread is a signal to the thread that it should stop what it’s doing (politely).
 *      It does not forcibly kill the thread. Instead, it sets a special flag inside the thread object called the interrupt status.
 * So it’s like raising a hand and saying:
 *  “Hey thread, please stop when you get a chance.”
 *  interrupt() doesn’t stop the thread immediately — it’s cooperative.
 */
public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(new MyTask());
        worker.start();

        Thread.sleep(3000);
        worker.interrupt();
    }

}


class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Working...");
                Thread.sleep(1000); // can be interrupted
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted, cleaning up...");
        }
    }
}