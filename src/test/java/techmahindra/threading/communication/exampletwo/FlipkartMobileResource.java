package techmahindra.threading.communication.exampletwo;

import java.util.LinkedList;

public class FlipkartMobileResource {

    LinkedList<Integer> smartWatchCount = new LinkedList<>();
    int maxInventoryCount = 10;

    void produceSmartWatches() {

        int count = 1;

        while (true) {

            synchronized (this) {

                if (smartWatchCount.size() == maxInventoryCount) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {

                    }
                }

                smartWatchCount.add(count);
                System.out.println("Producer produced-" + count);
                count++;
                //notify(); // may not wake up appropriate thread
                notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {

                }
            }
        }

    }

    void consumerSmartWatches() {
        int count = 1;
        while (true) {

            synchronized (this) {

                if (smartWatchCount.isEmpty()) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                    }
                }

                int val = smartWatchCount.removeFirst();

                System.out.println("Consumer consumed-" + val);

                //notify(); // may not wake up appropriate thread
                notifyAll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {

                }
            }
        }
    }
}
