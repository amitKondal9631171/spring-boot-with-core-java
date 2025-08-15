package techmahindra.threading.communication.exampleone;

public class YieldThread implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i<=10000; i++){
            System.out.println("Yield thread is in progress");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i%5 == 0){
                System.out.println("Thread wants to wait: "+i);
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new YieldThread();
        Thread t = new Thread(runnable, "Yield Thread");
        t.start();

    }

}
