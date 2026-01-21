package interview;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatternList {

    public static void main(String[] args) {

        List<List<Employee> > empList = List.of(
                Arrays.asList(
                new Employee(1, "Rohit", "IT", 2000),
                new Employee(2, "Amit", "IT", 1000),
                new Employee(3, "Sita", "HR", 3000),
                new Employee(4, "Varun", "Finance", 2000),
                new Employee(5, "Tarun", "Clark", 1000),
                new Employee(6, "Vikas", "Finance", 3000),
                new Employee(7, "Arti", "HR", 5000),
                new Employee(9, "Seema", "Clark", 3000),
                new Employee(9, "Pawan", "Engineering", 3000)
                )
        );

        System.out.println("Before: "+empList);
        empList.stream().flatMap(Collection::stream).forEach(System.out::println);
    }

}
