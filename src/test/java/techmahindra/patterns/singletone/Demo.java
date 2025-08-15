package techmahindra.patterns.singletone;


public class Demo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        //Single threaded
        SingleObject object = SingleObject.getInstance();
        System.out.print(object +" ");
        object.showMessage();

        //Multiple threaded
        new Demo().multipleThreads();


    }

    void multipleThreads() {
        new TestMultiThreadedSingletone().start();
        new TestMultiThreadedSingletone().start();
        new TestMultiThreadedSingletone().start();
        new TestMultiThreadedSingletone().start();
    }

    class TestMultiThreadedSingletone extends Thread{
        public void run(){
            //System.out.println("Multi : " +SingleObject.getMultiThreadedInstance());
            System.out.println("Single : " +SingleObject.getInstance());
        }
    }
}
