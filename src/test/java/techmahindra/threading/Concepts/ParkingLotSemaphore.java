package techmahindra.threading.Concepts;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Semaphore is required to limit the number of threads that can access a resource at the same time.
 * Here resource means not objet but it is a concept.
 * Resource is a pool of objects.
 * Why race condition does not occur in this because If the resource is actually a pool of identical slots
 *      (like parking spots, DB connections, checkout counters), then multiple threads can safely use different instances of the resource without interfering.
 *      In this case, race conditions don’t happen, because each thread gets its own slot.
 */
public class ParkingLotSemaphore {
    private static final int PARKING_SPOTS = 5; // Total parking spots available
    private static final Semaphore parkingSpots = new Semaphore(PARKING_SPOTS, true);
    private static final int TOTAL_CARS = 10; // Total cars trying to park

    static class Car extends Thread {
        private final String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is trying to enter parking lot");

                // Try to acquire a parking spot
                if (parkingSpots.tryAcquire(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println(name + " has parked in spot " +
                                (PARKING_SPOTS - parkingSpots.availablePermits()) +
                                " | Available spots: " + parkingSpots.availablePermits());

                        // Simulate the car being parked for some time
                        Thread.sleep((long) (Math.random() * 5000));

                    } finally {
                        // Release the parking spot
                        parkingSpots.release();
                        System.out.println(name + " has left the parking lot | Available spots: " +
                                (parkingSpots.availablePermits()));
                    }
                } else {
                    System.out.println(name + " couldn't find a parking spot and left");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(name + " was interrupted while parking");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Parking lot with " + PARKING_SPOTS + " spots is open!");

        // Create and start multiple car threads
        for (int i = 1; i <= TOTAL_CARS; i++) {
            new Car("Car-" + i).start();
            try {
                // Add some delay between car arrivals
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}