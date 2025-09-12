package capgemini.java8.terminal;


import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.List;

public class UsingForEach {
    static List<Employee> empList = Arrays.asList(
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(1, "Amit", "IT", 1000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        empList.stream().forEach(System.out::println);
        empList.stream().forEachOrdered(System.out::println);
    }

}
