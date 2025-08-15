package techmahindra.threading.Concepts;


import java.util.concurrent.*;

public class BlockingQueueImplementation {
    /**
     * Queue internally uses reentrant lock while adding element in the queue
     */
    private static void arrayBlockingQueue(){
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(3);
        addElements(queue);
    }

    private static void delayBlockingQueue(){
        BlockingQueue<Integer> queue = new DelayQueue();
        addElements(queue);
    }

    private static void linkedBlockingQueue(){
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(1);
        addElements(queue);
    }

    private static void priorityLinkedBlockingQueue(){
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(1);
        addElements(queue);
    }

    public static void main(String[] args) {
        //arrayBlockingQueue();
        //delayBlockingQueue();
        /**
         * will take specified no. of elements.
         */
        //linkedBlockingQueue();
        /**
         * resized automatically
         */
        priorityLinkedBlockingQueue();
    }

    static void addElements(BlockingQueue<Integer> queue){
       /* try {
            //put method will not throw exception if it is unable to insert record in the queue and will wait to insert the element.
            queue.put(1); queue.put(1); queue.put(1); queue.put(1); queue.put(1); queue.put(1);


         } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        /**
         * add method will throw exception if unable to insert the record..
         *
         */
        queue.add(1); queue.add(1);queue.add(1);

        try {
            int a =  queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
