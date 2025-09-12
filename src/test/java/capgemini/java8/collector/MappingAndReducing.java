package capgemini.java8.collector;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingAndReducing {

    static List<Employee> empList = Arrays.asList(
            new Employee(1, "Amit", "IT", 1000),
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        //Find the total salary of employees.
        int totalSalary = empList.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(totalSalary);

        //Find the total salary of employees using reduce.
        int totalSalary2 = empList.stream().collect(Collectors.reducing(0, Employee::getSalary, Integer::sum));
        System.out.println(totalSalary2);

        //transform elements before passing to downstream collector.
         int  employees = empList.stream().collect(Collectors.mapping(Employee::getSalary, Collectors.summingInt(Integer::intValue)));
        System.out.println(employees);



    }
}
