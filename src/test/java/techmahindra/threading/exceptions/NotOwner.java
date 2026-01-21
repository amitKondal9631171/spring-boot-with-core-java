package techmahindra.threading.exceptions;


public class NotOwner {

    public static synchronized void acquireLock(NotOwner sharedObject) throws InterruptedException {
        System.out.println("going to wait");
        sharedObject.wait();
        System.out.println("resume execution");
    }

    public static synchronized void notifyLock(NotOwner sharedObject) throws InterruptedException {
        sharedObject.notify();
    }

    public static void main(String[] args) {
        NotOwner sharedObject = new NotOwner();

        new Thread(() -> {
            try {

                acquireLock(sharedObject);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {

                notifyLock(sharedObject);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();


    }
}
