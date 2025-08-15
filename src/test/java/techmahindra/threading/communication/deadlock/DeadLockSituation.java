package techmahindra.threading.communication.deadlock;

public class DeadLockSituation {

    /**
     * For deadlock to occur we need two resources
     * Implement circular dependency inside resource
     * @param args
     */
    public static void main(String[] args) {
        DeadLockEnabledResource resource1 = new DeadLockEnabledResource("Resource-1");
        DeadLockEnabledResource resource2 = new DeadLockEnabledResource("Resource-2");

        Runnable addRunnable = () -> resource1.addResource(resource2);
        Runnable updateRunnable = () -> resource2.updateResource(resource1);

        Thread t1 = new Thread(addRunnable, "Add Resource Thread");
        Thread t2 = new Thread(updateRunnable, "Update Resource Thread");

        t1.start();
        t2.start();

    }
}
