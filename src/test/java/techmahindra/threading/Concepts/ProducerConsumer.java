package techmahindra.threading.Concepts;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {


       final List<Integer> sharedQ = new ArrayList<>();

        Thread consumerThread = new Thread(new Consumer1(sharedQ, 4), "CONSUMER");
        Thread producerThread = new Thread(new Producer1(sharedQ, 4), "PRODUCER");

        producerThread.start();
        consumerThread.start();



        //producerThread.join();

    }

}

/**
 * Producer Thread will keep producing values for Consumer.
 *
 * It will use wait() method when Queue is full and
 * use notify() method to send notification to Consumer Thread.
 *
 * @author CodePumpkin
 *
 */
class Producer1 implements Runnable
{
    private final List<Integer> sharedQ;
    private int maxSize;

    public Producer1( List<Integer> sharedQ, int maxSize)
    {
        this.sharedQ = sharedQ;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){

        while(true)
        {
            synchronized (sharedQ) {

                if(sharedQ.size()==maxSize)
                {
                    try
                    {
                        System.out.println("Queue is full");
                       // Thread.sleep(5000);
                        sharedQ.wait();

                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
                Random random = new Random();
                int number = random.nextInt(100);
                System.out.println("Producing value " + number);
                sharedQ.add(number);
                sharedQ.notify();
            }

        }
    }
}

/**
 * Consumer Thread will consumer values form shared queue.
 *
 * It will use wait() method to wait if queue is empty.
 *
 * It will also use notify method to send notification
 * to producer thread after consuming values from queue.
 *
 * @author CodePumpkin
 *
 */
class Consumer1 implements Runnable
{
    private final List<Integer> sharedQ;
    private int maxSize;

    public Consumer1( List<Integer> sharedQ, int maxSize)
    {
        this.sharedQ = sharedQ;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        while(true)
        {
            synchronized (sharedQ) {

                if(sharedQ.isEmpty())
                {
                    try {
                        System.out.println("Que is Empty");
                      //  Thread.sleep(5000);

                        sharedQ.wait();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                int number = sharedQ.remove(0);
                System.out.println("removing Element " + number);
                sharedQ.notify();
            }
        }
    }

}