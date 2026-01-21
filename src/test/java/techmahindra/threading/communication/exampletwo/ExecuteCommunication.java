package techmahindra.threading.communication.exampletwo;

public class ExecuteCommunication {

    public static void main(String[] args) throws InterruptedException {

        FlipkartMobileResource mobileResource = new FlipkartMobileResource();

        Runnable runProducer = mobileResource::produceSmartWatches;
        Runnable runConsumer = mobileResource::consumerSmartWatches;

        Thread t1 = new Thread(runProducer, "Producer Thread");
        Thread t2 = new Thread(runConsumer, "Consumer Thread");

        t1.start();t2.start();

        t1.join();
        t2.join();// t2 will wait until t1 completes the execution
    }
}
