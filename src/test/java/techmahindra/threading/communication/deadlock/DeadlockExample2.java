package techmahindra.threading.communication.deadlock;

class DeadlockExample2 {

    private final Object coffeeMachine = new Object();
    private final Object printingMachine = new Object();

    void method1() {
        synchronized (coffeeMachine) {        // Always lock lock1 first
            System.out.println(Thread.currentThread().getName() + " has acquired lock on Coffee Machine:" + Thread.holdsLock(coffeeMachine));
            synchronized (printingMachine) {
                System.out.println("Acquire lock on Object Printing Machine");
            }
        }
    }

    void method2() {
        synchronized (printingMachine) {        // Lock in same order
            System.out.println(Thread.currentThread().getName() + " has acquired lock on Printing Machine:" + Thread.holdsLock(printingMachine));
            synchronized (coffeeMachine) {
                System.out.println("Acquire lock on Object Coffee Machine");
            }
        }
    }
    public static void main(String[] args) {
        DeadlockExample2 lock1 = new DeadlockExample2();

        new Thread(lock1::method1, "Coffee-Thread").start();
        new Thread(lock1::method2, "Printing-Thread").start();

       /* StringIntegerDeadLock obj = new StringIntegerDeadLock();
        Runnable runnable1 = obj::method1;
        Runnable runnable2 = obj::method2;

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start(); th2.start();*/
    }
}
