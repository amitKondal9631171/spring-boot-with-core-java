package techmahindra.threading.Concepts.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> q){
        this.queue=q;
    }

    @Override
    public void run() {

         for(int i=0; i<100; i++){
            try {
                queue.put(i);
                System.out.println("Produced "+ i );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}