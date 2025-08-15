package techmahindra.threading.Concepts;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {


    List<Thread> threads = new ArrayList();
    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        for(Runnable run : tasks){
            threads.add(new Thread(run));
        }
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        for(Thread thread : threads){
            thread.start();
        }
    }

    public static void main(String x[]){
        System.out.println("Starting");
        Runnable r1 = () -> System.out.println("r1");
        Runnable r2 = () -> System.out.println("r2");
        Runnable r3 = () -> System.out.println("r3");
        List<Runnable> runs = new ArrayList<>();
        runs.add(r1);
        runs.add(r2);
        runs.add(r3);

        System.out.println("Starting");
        MultiExecutor Object = new MultiExecutor(runs);
        System.out.println("Processing");
        Object.executeAll();
    }
}