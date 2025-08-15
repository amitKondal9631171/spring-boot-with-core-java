package techmahindra.threading.communication.exampleone;

public class Producer implements Runnable{

    SharedResource sharedResource;
    Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;

        Thread t = new Thread(this, "Producer");
        t.start();
    }
    @Override
    public void run() {

        for (int i = 1; i<=100; i++){

            sharedResource.setCount(i);

        }
    }

}
