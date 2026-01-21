package techmahindra.threading.testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThread {

   static Runnable runnableCode = () -> {
        System.out.println("withRunnable implementation");
    };
    public static void main(String[] args) {



        Thread withoutRunnable = new Thread("withoutRunnable"){
            @Override
            public void run() {
                System.out.println("withoutRunnable implementation");
            }
        };



        Thread withRunnable = new Thread(runnableCode,"withRunnable");

        withRunnable.start();
        withoutRunnable.start();

    }
}
