package capgemini.java8.collector;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    static List<Employee> empList = Arrays.asList(
            new Employee(1, "Amit", "IT", 1000),
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        //concatenate strings
        String namesConcat = empList.stream().map(Employee::getFirstName).collect(Collectors.joining());
        System.out.println(namesConcat);

        //Join the names of employees.
        String names = empList.stream().map(Employee::getFirstName).collect(Collectors.joining(", "));
        System.out.println(names);

        //Join the names of employees with prefix and suffix.
        String namesWithPrefixSuffix = empList.stream().map(Employee::getFirstName).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(namesWithPrefixSuffix);




    }
}
