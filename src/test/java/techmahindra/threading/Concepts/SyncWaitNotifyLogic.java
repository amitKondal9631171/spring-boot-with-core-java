package techmahindra.threading.Concepts;


/**
*  Every Object in Java Can Be a Monitor
     * In Java, every object has an intrinsic lock (monitor).
     * When you use synchronized, you actually acquire the monitor of that object.
     * So, it makes sense for the methods controlling waiting and notification (like wait and notify) to be available on every object.
 */
public class SyncWaitNotifyLogic {

    public static synchronized void acquireLock(SyncWaitNotifyLogic sharedObject) throws InterruptedException {
        System.out.println("going to wait");
        sharedObject.wait();
        System.out.println("resume execution");
    }

    public static synchronized void notifyLock(SyncWaitNotifyLogic sharedObject) throws InterruptedException {
        System.out.println("going to wait");
        sharedObject.notify();
        System.out.println("resume execution");
    }

    public static void main(String[] args) {
        SyncWaitNotifyLogic sharedObject = new SyncWaitNotifyLogic();

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
