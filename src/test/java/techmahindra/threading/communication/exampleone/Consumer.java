package techmahindra.threading.communication.exampleone;


public class Consumer implements Runnable{

    SharedResource sharedResource;

    Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 1; i<=100; i++){

            sharedResource.getCount();

        }
    }
}
