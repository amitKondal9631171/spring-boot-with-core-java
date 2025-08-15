package techmahindra.threading.communication.exampleone;

public class SharedResource {

    int count;
    boolean valueSet = false;

    public synchronized void getCount() {

        if(!valueSet){
            try {
                wait();
            }catch (Exception exception){
            }
        }
        System.out.println("Consumed Count: "+count);
        valueSet = false;
       notify();
    }

    public synchronized void setCount(int count) {
        if(valueSet){
         try {
             wait();
         }catch (Exception exception){
         }
        }
        System.out.println("Produced Count: "+count);
        this.count = count;
        valueSet = true;
        notify();
    }
}
