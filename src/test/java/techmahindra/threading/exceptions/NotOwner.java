package techmahindra.threading.exceptions;

//"Thread-0" java.lang.IllegalMonitorStateException: current thread is not owner

public class NotOwner {
    public static synchronized void acquireLock(NotOwner sharedObject) throws InterruptedException {
        System.out.println("going to wait");
        sharedObject.wait();
        System.out.println("resume execution");
    }

    public static synchronized void notifyLock(NotOwner sharedObject) throws InterruptedException {
        System.out.println("going to wait");
        sharedObject.notify();
        System.out.println("resume execution");
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
