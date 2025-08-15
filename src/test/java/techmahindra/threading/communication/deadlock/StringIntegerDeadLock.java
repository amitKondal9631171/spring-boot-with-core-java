package techmahindra.threading.communication.deadlock;

public class StringIntegerDeadLock {

    void method1(){

        synchronized (String.class){

            System.out.println("Acquired lock on String.class object");

            synchronized (Integer.class){

                System.out.println("Acquired lock on Integer.class object");

            }
        }

    }

    void method2(){

        synchronized (Integer.class){

            System.out.println("Acquired lock on Integer.class object");

            synchronized (String.class){

                System.out.println("Acquired lock on String.class object");

            }
        }

    }

    public static void main(String[] args) {

        StringIntegerDeadLock obj = new StringIntegerDeadLock();
        Runnable runnable1 = obj::method1;
        Runnable runnable2 = obj::method2;

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start(); th2.start();

    }
}
