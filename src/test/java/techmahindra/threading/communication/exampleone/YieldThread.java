package techmahindra.threading.communication.exampleone;

//yield() is just a hint, not a guarantee — behavior depends on the OS thread scheduler and JVM implementation.
public class YieldThread implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i<=20; i++){
            System.out.println(Thread.currentThread().getName()+ " running the process");
            if (i%5 == 0){
                System.out.println(Thread.currentThread().getName()+ " called the yield method");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new YieldThread();
        Thread t = new Thread(runnable, "Yield Thread");
        t.start();

        Runnable runnable1 = new YieldThread();
        Thread t1 = new Thread(runnable1, "Yield Thread 1");
        t1.start();
    }

}
