package techmahindra.threading.exceptions;

public class InterruptedExceptionExp {

    public static void main(String[] args) {


            new Thread(()-> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start(); // throws InterruptedException})

        new Thread(()-> {
            Thread.currentThread().interrupt();
        }).start();



    }
}
