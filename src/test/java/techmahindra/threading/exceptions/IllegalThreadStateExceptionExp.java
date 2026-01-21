package techmahindra.threading.exceptions;

public class IllegalThreadStateExceptionExp {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Running..."));
        t.start();
        t.start(); // ❌ Throws IllegalThreadStateException

    }
}
