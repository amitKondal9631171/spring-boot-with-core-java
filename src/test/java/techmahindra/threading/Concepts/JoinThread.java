package techmahindra.threading.Concepts;

/**
 * Created by HP-USER on 22-01-2019.
 */
public class JoinThread extends Thread{

    JoinThread(String threadName){
        super(threadName);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(5000);
            }catch(Exception e){System.out.println(e);}
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+": "+i);
        }
    }
    public static void main(String args[]){
        System.out.println("Main thread is daemon or not ?: "+Thread.currentThread().isDaemon());
        JoinThread t1=new JoinThread("Thread 1");
        JoinThread t2=new JoinThread("Thread 2");
        JoinThread t3=new JoinThread("Thread 3");
        t1.start();
        try{

            //The join() method waits for a thread to die.
            //Means first this thread will be executed....
            t1.join();

            t2.start();

            t3.start();


        }catch(Exception e){System.out.println(e);}


    }
}
