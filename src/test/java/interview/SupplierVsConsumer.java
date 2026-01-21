package interview;


import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierVsConsumer {

    /**
     * Common uses:
         Lazy creation
         Deferred execution
         Object factories
         Configuration providers
     */
    static void supplierExample1(){
        Supplier<String> tokenSupplier = () -> {

                 System.out.println("Supplier Thread name: " + Thread.currentThread().getName());
                return  UUID.randomUUID().toString();

        };

        String token = tokenSupplier.get();

        System.out.println("Supplier has generated: " + token);
    }

    /**
     * Common uses:
         Logging
         Saving to DB
         Sending messages
        Side effects
     */
    static void consumerExample1(){
        Stream.generate(() -> Math.random())
                .limit(3)
                .forEach(v-> {
                    System.out.println("Consumer Thread name: " + Thread.currentThread().getName());
                    System.out.println("Consumed Value: " + v);
                });
    }

    static void combinedExample(){
        Supplier<Integer> supplier = () -> 42; //gives you something
        Consumer<Integer> consumer = x -> System.out.println(x); //takes something and does something with it

        consumer.accept(supplier.get());
    }

    public static void main(String[] args) {
        supplierExample1();
        consumerExample1();
        combinedExample();
    }
}
