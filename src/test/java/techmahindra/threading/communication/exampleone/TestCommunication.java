package techmahindra.threading.communication.exampleone;


public class TestCommunication {

    public static void main(String[] args) throws InterruptedException {

        SharedResource resource = new SharedResource();

        new Producer(resource);
        new Consumer(resource);


    }
}
