package techmahindra.threading.communication.exampleone;

public class SharedResource {

    int count;
    boolean resourceUpdated = false;

    public synchronized void getCount() {

        if(!resourceUpdated){
            try {
                wait();
            }catch (Exception exception){
            }
        }
        System.out.println("Consumed Count: "+count);
        resourceUpdated = false;
       notify();
    }

    public synchronized void setCount(int count) {
        if(resourceUpdated){
             try {
                 wait();
             }catch (InterruptedException exception){
                 System.out.println("InterruptedException occurred on wait method");
             }
        }
        System.out.println("Produced Count: "+count);
        this.count = count;
        resourceUpdated = true;
        notify();
    }
}
