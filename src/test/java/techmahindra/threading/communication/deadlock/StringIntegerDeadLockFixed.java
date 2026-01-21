package techmahindra.threading.communication.deadlock;


/**
 * One of the way is to acquire a lock in sequence
 * Here we have fixed with this approach only.
 */
public class StringIntegerDeadLockFixed {


    void method1(){

        synchronized (Integer.class){

            System.out.println("Acquired lock on Integer.class object");

            synchronized (String.class){

                System.out.println("Acquired lock on String.class object");

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

        StringIntegerDeadLockFixed obj = new StringIntegerDeadLockFixed();
        Runnable runnable1 = obj::method1;
        Runnable runnable2 = obj::method2;

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start(); th2.start();

    }
}
