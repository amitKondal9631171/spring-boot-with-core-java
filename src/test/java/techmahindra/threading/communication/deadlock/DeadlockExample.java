package techmahindra.threading.communication.deadlock;

class DeadlockExample {

    void method1(DeadlockExample lock2) {
        synchronized (this) {
            System.out.println("Thread1 holds lock1...");
            lock2.method2(this);
        }
    }

    void method2(DeadlockExample lock1) {
        synchronized (this) {
            System.out.println("Thread2 holds lock2...");

            lock1.method1(this);
        }
    }

    public static void main(String[] args) {
        DeadLockEnabledResource lock1 = new DeadLockEnabledResource("Object 1");
        DeadLockEnabledResource lock2 = new DeadLockEnabledResource("Object 2");

        new Thread(() -> lock1.addResource(lock2)).start();
        new Thread(() -> lock2.updateResource(lock1)).start();
    }
}
