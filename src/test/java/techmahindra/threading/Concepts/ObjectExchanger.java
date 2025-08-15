package techmahindra.threading.Concepts;


import java.util.concurrent.Exchanger;

public class ObjectExchanger {

    Exchanger exchanger = new Exchanger();


    private void executeThreads() {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    int a = 1 / 0;
                } catch (Exception e) {
                    try {
                        String abc = e.getMessage();
                        System.out.println("Error :" + abc);
                        exchanger.exchange(abc);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }

            }
        });


        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Object from other " + (exchanger));
            }
        });

        threadOne.start();
        threadTwo.start();
    }

    public static void main(String[] args) {

        new ObjectExchanger().executeThreads();
    /*
        Exchanger exchanger = new Exchanger();

        ExchangerRunnable exchangerRunnable1 = new ExchangerRunnable(exchanger, "A");

        ExchangerRunnable exchangerRunnable2 = new ExchangerRunnable(exchanger, "B");

        new Thread(exchangerRunnable1).start();
        new Thread(exchangerRunnable2).start();*/

    }

}