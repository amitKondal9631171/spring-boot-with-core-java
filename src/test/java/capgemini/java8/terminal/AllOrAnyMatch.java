package capgemini.java8.terminal;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.List;

public class AllOrAnyMatch {

    static List<Employee> empList = Arrays.asList(
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(1, "Amit", "IT", 1000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        boolean valid = empList.stream().allMatch(emp -> emp.getSalary() > 1000);
        System.out.println("All employees has salary greater than 1000: "+valid);


        valid = empList.stream().anyMatch(emp -> emp.getSalary() > 1000);
        System.out.println("Any employee has salary greater than 1000: "+valid);


    }
}
