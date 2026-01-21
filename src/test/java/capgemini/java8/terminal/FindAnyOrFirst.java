package capgemini.java8.terminal;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.List;

public class FindAnyOrFirst {
    static List<Employee> empList = Arrays.asList(
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(1, "Amit", "IT", 1000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        /**
         * Returns any element of the stream.
         * Non-deterministic → running it twice may give different results.
         * with sequential streams findAny() will “always pick the first” but with parallel streams it will pick any element.
         * It will pick first because streams are processed in encounter order i.e. in sequential streams it will process elements in the order they are present in the stream.
         */
        Employee ds = empList.stream().findAny().orElse(null);//ifPresent(System.out::println);


        /**
         * Always returns the first element in the stream (in encounter order).
         * Deterministic → if you run it twice on the same data, you’ll always get the same result.
         * In a parallel stream, it has to coordinate across multiple threads to ensure the first element in encounter order is returned. This means more synchronization overhead.
         */
        empList.stream().findFirst().ifPresent(System.out::println);


    }
}
