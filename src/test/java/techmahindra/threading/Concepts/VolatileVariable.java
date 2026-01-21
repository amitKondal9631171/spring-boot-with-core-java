package techmahindra.threading.Concepts;

class VolatileResource{

    volatile int volatileCount;
    int nonVolatileCount;

    public int getVolatileCount() {
        return volatileCount;
    }

    public void setVolatileCount(int volatileCount) {
        this.volatileCount = volatileCount;
    }

    public int getNonVolatileCount() {
        return nonVolatileCount;
    }

    public void setNonVolatileCount(int nonVolatileCount) {
        this.nonVolatileCount = nonVolatileCount;
    }
}

/**
 * volatile variables are shared variables between the threads like static is shared b/w the objects
 * same volatiles are shared among the threads.
 */
public class VolatileVariable {

    public static void main(String[] args) {

        VolatileResource resource = new VolatileResource();

        Runnable r1 = () -> {
            resource.setNonVolatileCount(1);
            resource.setVolatileCount(2);
        };

        Runnable r2 = () -> {

            try {
                //Giving time to thread 1 to make sure thread will complete assigning the values
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("Non-Volatile variable value: "+ resource.getNonVolatileCount());
            System.out.println("Volatile variable value: "+resource.getVolatileCount());

        };


        Thread t1 = new Thread(r1, "Add Resource Thread");
        Thread t2 = new Thread(r2, "Update Resource Thread");

        t1.start();
        t2.start();

    }
}
