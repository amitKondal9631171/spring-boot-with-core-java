package techmahindra.threading.testing;

public class CreateThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Run implementation");
    }

    public static void main(String[] args) {

       CreateThread ct = new CreateThread();

       Thread t = new Thread(ct,"Custom Thread");
       t.start();

    }
}
