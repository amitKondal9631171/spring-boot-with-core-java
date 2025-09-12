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
         DeadlockExample lock1 = new DeadlockExample();
         DeadlockExample lock2 = new DeadlockExample();

        new Thread(() -> lock1.method1(lock2)).start();
        new Thread(() -> lock2.method2(lock1)).start();
    }
}
