package techmahindra.threading.Concepts;

class MonitorExample {
    private boolean ready = false;

    public synchronized void waitForSignal() throws InterruptedException {
        while (!ready) {   // always check condition in a loop
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " got the signal!");
    }

    public synchronized void sendSignal() {
        ready = true;
        //notifyAll(); // wake up all waiting threads
        System.out.println(Thread.currentThread().getName() + " sent the signal!");
    }

    public static void main(String[] args) {
        MonitorExample monitor = new MonitorExample();

        Thread waiter1 = new Thread(() -> {
            try { monitor.waitForSignal(); } catch (InterruptedException ignored) {}
        }, "Waiter-1");

        Thread waiter2 = new Thread(() -> {
            try { monitor.waitForSignal(); } catch (InterruptedException ignored) {}
        }, "Waiter-2");

        waiter1.start();
        waiter2.start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                monitor.sendSignal();
            } catch (InterruptedException ignored) {}
        }, "Notifier").start();
    }
}
