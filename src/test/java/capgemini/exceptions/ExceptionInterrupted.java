package capgemini.exceptions;

public class ExceptionInterrupted {

    //In this case no exception will occur because thread is not sleeping.
    //And interruption works on sleeping thread only.
    static void InterruptedMethodWorksForSleepingThreadOnly(){
        Runnable r1 = () -> {

            for (int i = 0; i < 5; i++)
                System.out.println(i);

        };

        Thread t1 = new Thread(r1);

        t1.start();
        t1.interrupt();

    }

    static void InterruptedThread(){

        Runnable r1 = () -> {

            try {
                Thread.sleep(2000);
                System.out.println("Working");
            } catch (InterruptedException exception) {
                System.out.println("==============Thread interrupted=========");
            }

        };

        Thread t1 = new Thread(r1);
        t1.start();

        t1.interrupt();

    }

    public static void main(String[] args) {
        InterruptedMethodWorksForSleepingThreadOnly();
        InterruptedThread();
    }

}
