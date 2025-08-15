package techmahindra.threading.Concepts.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> q){
        this.queue=q;
    }

    @Override
    public void run() {
        try{
            Integer msg;
            //consuming messages until exit message is received
            while(queue.size() != 0){
                System.out.println("Consumed "+ queue.poll() );
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}